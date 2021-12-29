<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Ustad extends CI_Controller {

	public function index(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION
			$id_user     = $_SESSION['session_username'];

			$table = "user";
			$where = "tipe_user = 'Mahasiswa' ";
			$mahasiswa = $this->mdata->select_data($table, $where);

			$table = "user";
			$where = "tipe_user = 'Ustad' ";
			$ustad = $this->mdata->select_data($table, $where);

			$table = "surah";
			$surah = $this->mdata->select($table);

			$query = "select distinct mahasiswa from setoran_hafalan where ustad='$id_user'";
			$mahasiswa_bimbingan = $this->mdata->select_manual($query);

			
			$this->load->view('ustad/index.php', array(
				'mahasiswa'           => $mahasiswa,
				'ustad'               => $ustad,
				'surah'               => $surah,
				'mahasiswa_bimbingan' => $mahasiswa_bimbingan,
			));
		}
	}

	public function test(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			$id_user     = $_SESSION['session_username'];

			$mahasiswa     = $_POST['mahasiswa'];
			$tipe_hafalan  = $_POST['tipe_hafalan'];
			$surah_hafalan = $_POST['surah_hafalan'];
			$penilaian     = $_POST['penilaian'];

			//$_SESSION['mahasiswa'] = $mahasiswa;

			$table = "setoran_hafalan";
			$where = "mahasiswa = '$mahasiswa' and tipe_hafalan='$tipe_hafalan' and surah_hafalan='$surah_hafalan'";
			$cek_setoran = $this->mdata->select_data($table, $where);
		
			echo $count_cek_setoran = count($cek_setoran);

			$table = "setoran_hafalan";
			$data  = array(
				'mahasiswa'     => $mahasiswa,
				'ustad'         => $id_user,
				'tipe_hafalan'  => $tipe_hafalan,
				'surah_hafalan' => $surah_hafalan,
				'penilaian'     => $penilaian,
			);

			if ($count_cek_setoran>=1) {
				echo "Sudah Ada";
				// SUDAH ADA (UPDATE)
				$id_setoran_hafalan = $cek_setoran[0]['id_setoran_hafalan'];;
				$where = "id_setoran_hafalan = '$id_setoran_hafalan'";
				$tambah_data = $this->mdata->ubah_data($table,$where,$data);

				redirect(base_url()."index.php/ustad/lihat_histori_hafalan?mahasiswa=$mahasiswa");

			}else if ($count_cek_setoran==0) {
				echo "Belum Ada";
				// BELUM ADA (INSERT)
				$tambah_data = $this->mdata->tambah_data($table,$data);

				redirect(base_url()."index.php/ustad/lihat_histori_hafalan?mahasiswa=$mahasiswa");
			}
		}

		
	}

	public function lihat_histori_hafalan(){
		if (empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/welcome/");
		}else if (!empty($_SESSION['session_user'])) {
			
			$mahasiswa = $_GET['mahasiswa'];
			$_SESSION['mahasiswa'] = $mahasiswa;

			$table = "setoran_hafalan";
			$where = "mahasiswa='$mahasiswa' order by id_setoran_hafalan desc, surah_hafalan asc";

			$histori_setoran = $this->mdata->select_all_where($table,$where);
			//print_r($histori_setoran);

			$this->load->view('ustad/lihat_histori_hafalan.php', array(
				"histori_setoran" => $histori_setoran,
			));

		}

	}

	public function form_hapus(){
		$this->load->view('ustad/form_hapus.php');
	}

	public function aksi_hapus(){
		//authentikasi();

		$id    = $_GET['id_hapus'];
		$table = "setoran_hafalan";
		$where = "id_setoran_hafalan='$id'";

		$hapus_status = $this->mdata->delete_where($table,$where);

		redirect(base_url()."index.php/ustad/lihat_histori_hafalan?mahasiswa=".$_SESSION['mahasiswa']);

	}

}