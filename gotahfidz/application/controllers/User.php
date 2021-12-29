<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class User extends CI_Controller {

	public function index(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION
			$id_user     = $_SESSION['session_username'];
			$this->load->view('user/index.php');
		}
	}


	public function lihat_hasil_storan(){
		if (empty($_SESSION['session_user'])) {
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {

			$id_user = $_SESSION['session_username'];
			$nama_setoran = $_POST['nama_setoran'];

			$table = "setoran_hafalan";
			$where = "mahasiswa='$id_user' and tipe_hafalan='$nama_setoran' ";

			$histori_setoran = $this->mdata->select_all_where($table,$where);
			//print_r($histori_setoran);

			$this->load->view('user/histori_hafalan.php', array(
				"histori_setoran" => $histori_setoran,
			));
		}
	}























	public function checklist2(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION

			$tgl_awal_akhir = $this->mdata->tgl_awal_akhir();
			
			$tanggal_awal  = $tgl_awal_akhir[0]['min'];
			$tanggal_akhir = $tgl_awal_akhir[0]['max'];

			$table       = "m_jenis_cacat";
			$getfield    = "id_jenis_cacat, nama_cacat, deskripsi_cacat";
			$id_user     = $_SESSION['session_username'];
			$where       = "id_user='$id_user'";
			$jenis_cacat = $this->mdata->select_custom($getfield,$table,$where);

			$total_frekuensi = $this->mdata->total_frekuensi2($tanggal_awal, $tanggal_akhir);


			$pivotable       = $this->mdata->pivotable2($tanggal_awal, $tanggal_akhir);
			$distinct_record = $this->mdata->get_distinct_record($tanggal_awal, $tanggal_akhir);


			$count_distinct_record = count($distinct_record);

			$this->load->view('user/checklist2.php', array(
				"jenis_cacat"     => $jenis_cacat,
				"pivotable"       => $pivotable,
				"total_frekuensi" => $total_frekuensi,
				"distinct_record" => $distinct_record,
				"jumlah_record"   => $count_distinct_record,
			));
		}
	}

	public function test(){
		$test = $this->mdata->m_test();
		echo "<pre>";
		print_r($test);
	}

	public function simpan_checklist(){

		print_r($_POST);
		//exit;

		$id_user = $_SESSION['session_username'];
		$tanggal_periksa = $_POST['tanggal_periksa'];


		$tanggal_periksa_trim = str_replace("-", "", $tanggal_periksa);
		$frekuensi            = $_POST['frekuensi'];
		$id_jenis_cacat       = $_POST['id_jenis_cacat'];



		// INSERT DATA AWAL..
		$no=1;
		foreach( $id_jenis_cacat as $key => $ijc ) {
			$id_periksa_cacat = $tanggal_periksa_trim.$no;

			$table       = "periksa_cacat";
			$getfield    = "id_periksa_cacat, id_user";
			$id_user     = $_SESSION['session_username'];
			$where       = "id_periksa_cacat='$id_periksa_cacat' && id_user='$id_user'";
			$periksa_cacat = $this->mdata->select_custom($getfield,$table,$where);

			$cek_periksa_cacat = count($periksa_cacat);

			if ($cek_periksa_cacat==1) {
				# Update
				$query = $this->db->query("
					UPDATE periksa_cacat SET
					id_periksa_cacat = '$id_periksa_cacat',
					id_user          = '$id_user',
					tanggal_periksa  = '$tanggal_periksa',
					id_jenis_cacat   = '$ijc'
					WHERE `id_periksa_cacat`='$id_periksa_cacat' AND `id_user`='$id_user'"); 
			}else if ($cek_periksa_cacat!=1) {
				# Insert
				$query = $this->db->query("INSERT INTO `periksa_cacat` ( `id_periksa_cacat`, `id_user`,`tanggal_periksa`,`id_jenis_cacat`,`frekuensi` )
					VALUES
					('$id_periksa_cacat', '$id_user', '$tanggal_periksa', '$ijc', '')

					"); 
			}


			$no++;
		}

		// INSERT UPDATE FREKUENSI
		/**/
		$no=1;
		foreach( $frekuensi as $key => $f ) {
			$id_periksa_cacat = $tanggal_periksa_trim.$no;
			$query = $this->db->query("UPDATE periksa_cacat SET frekuensi='$f' WHERE `id_periksa_cacat`='$id_periksa_cacat'");   
			$no++;
		}

		redirect(base_url('index.php/user/checklist2'));

	}

	public function pivotable(){
		$pivo = $this->mdata->pivotable();

		echo "<pre>";
		print_r($pivo);
	}

	public function hitung_hari(){
		$kalender = CAL_GREGORIAN;
		$bulan = date('m');
		$tahun = date('Y');
		$hari = cal_days_in_month($kalender, $bulan, $tahun);
		$loop = '';

		for ($i=1; $i <= $hari ; $i++) { 
			$loop .= "SUM( IF(DAY(tanggal_periksa) = $i, frekuensi, 0) ) AS tg_$i, ";
		}

		echo $loop;

		//echo $hari;
	}

	public function jenis_cacat(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION

			$table       = "m_jenis_cacat";
			$getfield    = "id_jenis_cacat, nama_cacat, deskripsi_cacat";
			$id_user     = $_SESSION['session_username'];
			$where       = "id_user='$id_user' order by nama_cacat";
			$jenis_cacat = $this->mdata->select_custom($getfield,$table,$where);

			$this->load->view('user/jenis_cacat.php', array(
				"jenis_cacat" => $jenis_cacat,
			));
		}
	}

	public function tambah_jenis_cacat(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION
			$nama_cacat      = $_POST['nama_cacat'];
			$deskripsi_cacat = $_POST['deskripsi_cacat'];

			$table       = "m_jenis_cacat";
			$id_user     = $_SESSION['session_username'];
			$data = array(
				'id_user'         => $id_user,
				'nama_cacat'      => $nama_cacat,
				'deskripsi_cacat' => $deskripsi_cacat,
			);

			$jenis_cacat = $this->mdata->tambah_data($table,$data);
			redirect(base_url()."index.php/user/jenis_cacat");
			
		}
	}

	public function ubah_jenis_cacat(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION

			$id_jenis_cacat  = $_POST['id_jenis_cacat'];
			$deskripsi_cacat = $_POST['deskripsi_cacat'];
			$id_user         = $_SESSION['session_username'];
			
			$table           = "m_jenis_cacat";
			$where           = "id_user='$id_user' AND id_jenis_cacat='$id_jenis_cacat' ";

			$data = $_POST;

			$jenis_cacat = $this->mdata->ubah_data($table,$where,$data);
			redirect(base_url()."index.php/user/jenis_cacat");

		}
	}

	public function hapus_jenis_cacat($id_jenis_cacat){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION

			$table   = "m_jenis_cacat";
			$id_user = $_SESSION['session_username'];
			$where   = "id_jenis_cacat='$id_jenis_cacat' and id_user='$id_user' ";
			$jenis_cacat = $this->mdata->delete_where($table,$where);
			
			redirect(base_url()."index.php/user/jenis_cacat");

		}
	}

	public function paretodiagram(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION
			$table       = "m_jenis_cacat";
			$getfield    = "id_jenis_cacat, nama_cacat, deskripsi_cacat";
			$id_user     = $_SESSION['session_username'];
			$where       = "id_user='$id_user'";
			$jenis_cacat = $this->mdata->select_custom($getfield,$table,$where);
			
			$pivotable = $this->mdata->pivotable();

			$this->load->view('user/paretodiagram.php', array(
				"jenis_cacat" => $jenis_cacat,
				"pivotable"   => $pivotable,
			));
		}

	}

	public function logout(){
		session_destroy();
		redirect(base_url('index.php/welcome/'));
	}

}