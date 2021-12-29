<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Root extends CI_Controller {

	// Service add user when berhasil register..
	public function adduser($username, $password, $nama_user, $tipe_user){

		$table = "user";
		$data = array(
			"username" => $username,
			"password" => $password,
			"nama_user" => $nama_user,
			"tipe_user" => $tipe_user,
		);

		$tambah_data = $this->mdata->tambah_data($table,$data);
	}
}	