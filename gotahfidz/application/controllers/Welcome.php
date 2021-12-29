<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Welcome extends CI_Controller {

	public function index(){
		if (!empty($_SESSION['session_user'])) {
			// LOGIN
			redirect(base_url()."index.php/user/");
		}else if (empty($_SESSION['session_user'])) {
			// TIDAK ADA SESSION
			$this->load->view('welcome/index.php');
		}
		
	}

	public function login(){
		// menerima post dari formulir npm dan password
		$username = $_POST['username'];
		$password = $_POST['password'];
		
		$table    = "user";
		$getfield = "username,nama_user,tipe_user";
		$where    = "username='$username' AND password='$password'";
		$login    = $this->mdata->select_custom($getfield,$table,$where);

		print_r($login);

		$cek_login = count($login);

		foreach ($login as $sn) {
			$sn_username = $sn['username'];
			$sn_nama     = $sn['nama_user'];
			$tipe_user   = $sn['tipe_user'];
		}

		if ($tipe_user=="Mahasiswa") {
			if ($cek_login==1) {  // BERHASIL
				$_SESSION['session_user']       = base64_encode($sn_username.$sn_nama.$tipe_user);
				$_SESSION['session_username']   = $sn_username;
				$_SESSION['session_nama']       = $sn_nama;
				$_SESSION['tipe_user']          = $tipe_user;

				redirect(base_url()."index.php/user/");
				
			}else if ($cek_login!=1) {  // GAGAL
				redirect(base_url()."index.php/welcome/index");
			}
		}

		else if ($tipe_user=="Ustad") {
			if ($cek_login==1) {  // BERHASIL
				$_SESSION['session_user']       = base64_encode($sn_username.$sn_nama.$tipe_user);
				$_SESSION['session_username']   = $sn_username;
				$_SESSION['session_nama']       = $sn_nama;
				$_SESSION['tipe_user']          = $tipe_user;

				redirect(base_url()."index.php/ustad/");
				
			}else if ($cek_login!=1) {  // GAGAL
				redirect(base_url()."index.php/welcome/index");
			}
		}


			
		//print_r($login);

		//exit();

	}

	public function logout(){
		session_destroy();
		redirect(base_url('index.php/welcome/'));
	}

}

/*
$table        = "m_jenis_cacat";
			$getfield     = "*";
			$where        = "nama_cacat != ''";
			$data_cacat = $this->mdata->select_custom($getfield,$table,$where);

			$thead = $this->mdata->select_table_field($table);

			$this->load->view('user/index.php', array(
				"data_cacat" => $data_cacat,
				"thead"        => $thead,
			));

			*/