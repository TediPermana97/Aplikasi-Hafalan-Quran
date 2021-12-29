<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Mdata extends CI_Model {

  // DEFAULT

  function  m_test(){
    $query = $this->db->query("
      SELECT DISTINCT
          DAY(`periksa_cacat`.`tanggal_periksa`) AS tanggal,
          MONTH(`periksa_cacat`.`tanggal_periksa`) AS bulan,
          YEAR(`periksa_cacat`.`tanggal_periksa`) AS tahun
      FROM periksa_cacat
      WHERE id_user = 'azima' AND `periksa_cacat`.`tanggal_periksa` BETWEEN '2019-06-01' AND '2019-07-02'
      ORDER BY tanggal_periksa ASC

      ");
      return $query->result_array();
  }

  function tgl_awal_akhir(){
    $query = $this->db->query("
      SELECT
      MIN(tanggal_periksa) AS min,
      MAX(tanggal_periksa) AS max
      FROM periksa_cacat
    ");
      return $query->result_array();
  }

  function total_frekuensi(){
    $id_user = $_SESSION['session_username'];
    $query = $this->db->query("
      SELECT SUM(`frekuensi`) AS total_frekuensi FROM `periksa_cacat` where id_user='$id_user'"
    );
      return $query->result_array();
  }

  function total_frekuensi2($tanggal_awal, $tanggal_akhir){
    $id_user = $_SESSION['session_username'];
    $query = $this->db->query("
      SELECT SUM(`frekuensi`) AS total_frekuensi FROM `periksa_cacat` where id_user='$id_user'
      AND `periksa_cacat`.`tanggal_periksa` BETWEEN '$tanggal_awal' AND '$tanggal_akhir'
    ");
      return $query->result_array();
  }

  function get_distinct_record($tanggal_awal, $tanggal_akhir){
    $id_user  = $_SESSION['session_username'];
    $query = $this->db->query("
       SELECT DISTINCT
           DAY(`periksa_cacat`.`tanggal_periksa`) AS tanggal,
           MONTH(`periksa_cacat`.`tanggal_periksa`) AS bulan,
           YEAR(`periksa_cacat`.`tanggal_periksa`) AS tahun
       FROM periksa_cacat
       WHERE id_user = '$id_user' AND `periksa_cacat`.`tanggal_periksa` BETWEEN '$tanggal_awal' AND '$tanggal_akhir'
       ORDER BY tanggal_periksa ASC 
    ");
      return $query->result_array();
    
  }

  function pivotable2($tanggal_awal, $tanggal_akhir){

    $id_user  = $_SESSION['session_username'];
    
    $distinct_record = $this->mdata->get_distinct_record($tanggal_awal, $tanggal_akhir);

    $loop = '';

    $i=1;
    foreach ($distinct_record as $dr) {
      $loop .= "SUM( IF(DAY(`periksa_cacat`.`tanggal_periksa`) = ".$dr['tanggal']." AND MONTH(`periksa_cacat`.`tanggal_periksa`) = ".$dr['bulan']." AND YEAR(`periksa_cacat`.`tanggal_periksa`) = ".$dr['tahun']." , frekuensi, 0) ) AS tg_$i, "; 
      $i=$i+1;
    }

    // COBA QUERY WHERE PAKAI BEETWEEN...
    // NOMOR NOMOR AJA 1-N, BISA NAMPILIN TANGGAL / HARI
    // 
    $query = $this->db->query("
        
        SELECT  IFNULL(`m_jenis_cacat`.`nama_cacat`, 'TOTAL') AS jenis_cacat,
                
          $loop
          
          SUM(frekuensi) AS frekuensi
          
        FROM `m_jenis_cacat` INNER JOIN `periksa_cacat`
        ON `periksa_cacat`.`id_jenis_cacat`=`m_jenis_cacat`.`id_jenis_cacat` 
        WHERE `periksa_cacat`.`id_user`='$id_user' AND `periksa_cacat`.`tanggal_periksa` BETWEEN '$tanggal_awal' AND '$tanggal_akhir'
        GROUP BY `m_jenis_cacat`.`nama_cacat` 
        WITH ROLLUP
    
    ");
      return $query->result_array();

  }

  function pivotable(){

    $id_user  = $_SESSION['session_username'];
    
    $kalender = CAL_GREGORIAN;
    $bulan    = date('m');
    $tahun    = date('Y');
    $hari     = cal_days_in_month($kalender, $bulan, $tahun);

    $loop = '';

    // Looping Bulan..
      // Inisial Bulan
      // Cek jika terdapat record pada bulan, maka
      // Jika terdapat record maka
         // Inisial Tanggal
         // Get Bulan
         // Get Tanggal
         // Get Tahun
      // 


    for ($i=1; $i <= $hari ; $i++) { 
      $loop .= "SUM( IF(DAY(periksa_cacat.tanggal_periksa) = $i, frekuensi, 0) ) AS tg_$i, ";
    }
    

    // COBA QUERY WHERE PAKAI BEETWEEN...
    // NOMOR NOMOR AJA 1-N, BISA NAMPILIN TANGGAL / HARI
    // 
    $query = $this->db->query("
        SELECT  IFNULL(`m_jenis_cacat`.`nama_cacat`, 'TOTAL') AS jenis_cacat, 

          $loop
          
          SUM(frekuensi) AS frekuensi
        
        FROM `m_jenis_cacat` INNER JOIN `periksa_cacat`
        ON `periksa_cacat`.`id_jenis_cacat`=`m_jenis_cacat`.`id_jenis_cacat`
        WHERE MONTH(`periksa_cacat`.`tanggal_periksa`) = $bulan AND `periksa_cacat`.`id_user`='$id_user'
        GROUP BY `m_jenis_cacat`.`nama_cacat`
        WITH ROLLUP"
    );
      return $query->result_array();

  }

  function insert_select_distinct($insert_into_tb,$field_into,$tobekey,$field_select,$from_tb,$where){
    $query = $this->db->query("
      INSERT IGNORE INTO $insert_into_tb ($field_into)
      SELECT DISTINCT REPLACE(LOWER(CONCAT($field_select)),' ','') AS $tobekey,$field_select
      FROM $from_tb
      WHERE $where"
    );
      return $query;
  }

  function select_field($field,$table,$sort){
    $query = $this->db->query("SELECT $field FROM $table $sort");
    return $query->result_array();
  }

  function select_field_where_sort($field,$table,$where,$sort){
    $query = $this->db->query("SELECT $field FROM $table WHERE $where $sort");
    return $query->result_array();
  }

  function select_distinct($field,$table){
    $query = $this->db->query("SELECT distinct $field FROM $table");
    return $query->result_array();
  }

  function select_distinct_sort($field,$table,$sort){
    $query = $this->db->query("SELECT distinct $field FROM $table $sort");
    return $query->result_array();
  }

  function select_table_field($table){
    //[TABLE_CATALOG] [TABLE_SCHEMA] [TABLE_NAME] [COLUMN_NAME] [ORDINAL_POSITION] [COLUMN_DEFAULT] [IS_NULLABLE] [DATA_TYPE] [CHARACTER_MAXIMUM_LENGTH] [CHARACTER_OCTET_LENGTH] [NUMERIC_PRECISION] [NUMERIC_SCALE] [DATETIME_PRECISION] [CHARACTER_SET_NAME] [COLLATION_NAME] [COLUMN_TYPE] [COLUMN_KEY] [EXTRA] [PRIVILEGES] [COLUMN_COMMENT]
    $query = $this->db->query("
      SELECT column_name, data_type, character_maximum_length, column_type, column_comment
      FROM INFORMATION_SCHEMA.COLUMNS
      WHERE TABLE_NAME = N'$table'
    ");
    return $query->result_array();
  }

  function select_distinct_where($field,$table,$where){
    $query = $this->db->query("SELECT distinct $field FROM $table WHERE $where");
    return $query->result_array();
  }

  function select_all_where($table,$where){
    $query = $this->db->query("SELECT * FROM $table WHERE $where");
    return $query->result_array();
  }

  function select_manual($query){
    $query = $this->db->query("$query");
    return $query->result_array();
  }

  function select_custom($getfield,$table,$where){
    $query = $this->db->query("SELECT $getfield FROM $table WHERE $where");
    return $query->result_array();
  }

  function select($table){
    $query = $this->db->get($table);
    return $query->result_array();
  }

  function select_sort($table,$sort){
    $query = $this->db->query("SELECT * FROM $table $sort");
    return $query->result_array();
  }

  function select_data($table, $where){
    $query = $this->db->get_where($table, $where);
    return $query->result_array();
  }

  function ubah_data($table,$where,$data){
    $query = $this->db->where($where);
    $query = $this->db->update($table, $data);
    return $query;
  }

  function ubah_data_all($table,$data){
    $query = $this->db->update($table, $data);
    return $query;
  }

  function ubah_data_custom($table,$set,$where){
    $query = $this->db->query("UPDATE $table SET $set WHERE $where");
    return $query;
  }

  function ubah_data_query($table,$where,$data){
    $query = $this->db->query("UPDATE $table SET $data WHERE $where;");
    return $query;
  }

  function delete_where($table,$where){
    $query = $this->db->where($where);
    $query = $this->db->delete($table);
    return $query;
  }

  function tambah_data($table,$data){
    $query = $this->db->insert($table, $data);
    return $query;
  }

  function tambah_data_multi($table,$field,$data){
    $query = $this->db->query("INSERT INTO $table $field VALUES $data");
    return $query;
  }

  // CUSTOM AREA

  function daftar_dokumen_borang($where){
    
  }

  function implement_sk_yudisium(){
    $query = $this->db->query("UPDATE `datalulusan`
    LEFT JOIN `sk_yudisium` ON
    `datalulusan`.`jenjang` = `sk_yudisium`.`jenjang` AND `datalulusan`.`prodi` = `sk_yudisium`.`prodi` AND `datalulusan`.`tahun_akademik_lulus` = `sk_yudisium`.`tahun_akademik_lulus`
    SET
    `datalulusan`.`sk_yudisium`         = `sk_yudisium`.`no_sk_yudisium`,
    `datalulusan`.`tanggal_sk_yudisium` = `sk_yudisium`.`tanggal_sk_yudisium`,
    `datalulusan`.`tanggal_keluar`      = `sk_yudisium`.`tanggal_keluar`
    ");
    return $query;
  }

  function login_curl($npm, $password){
    
    $post_data = 'username=' .$npm. '&password=' .$password;

    $ch = curl_init();
    //curl_setopt($ch, CURLOPT_URL, "http://118.97.23.184:8793/service_demo/api/apiserv/login/format/json");

    //curl_setopt($ch, CURLOPT_URL, "http://118.97.23.184:8793/service_demo/api/apiserv/login/format/json");
    
    // CURL AKTIF
    curl_setopt($ch, CURLOPT_URL, "http://api.darmajaya.ac.id:8793/service_new/api/apiserv/login/format/json"); // S1
    //curl_setopt($ch, CURLOPT_URL, "http://api.darmajaya.ac.id:8793/service_new/api/apiserv/login_pasca/format/json"); // S2

    curl_setopt($ch, CURLOPT_POST, 1);
    curl_setopt($ch, CURLOPT_POSTFIELDS, $post_data);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    $server_output = curl_exec($ch);
    $status = curl_getinfo($ch, CURLINFO_HTTP_CODE);

    // JIKA STATUS CURL TERPUTUS ATAU TIDAK BERFUNGSI MAKA LOGIN KE DATA LOCAL
    if ($status==0) {
      $this->mdata->login_local($npm, $password);
      exit();
    }

    //var_dump($server_output);
    $data_response = json_decode($server_output);

    // JIKA TIDAK DITEMUKAN DI LOGIN CURL S1 MAKA CARI KE LOGIN CURL S2
    $status_login = isset($data_response->login_status);
    if ($status_login=='') {
      $this->mdata->login_curl_pasca($npm, $password);
      exit();
    }

    //var_dump($data_response);
    //contoh ambil login status[true/false]
    $data_response->login_status;

    //contoh parse message
    foreach ($data_response->message as $v) {
        $status = $v->info;
    }

    // JIKA DI CURL S1 ERROR MAKA KE LOGIN LOCAL
    if ($status=='Login gagal, username/password salah') {
      $this->mdata->login_local($npm, $password);
      exit();
    }

    // print_r data
    //echo"<pre>";
    //print_r($data_response->data);


    //contoh parse data mhs
    foreach ($data_response->data as $v) {
        $v->npm . ' ' . $v->nama . ' ' . $v->tipeuser. ' ' . $v->nm_jurusan;
    }
    //echo $data_response->login_status;
    $vtipeuser = strtolower($v->tipeuser);

    if ($vtipeuser=="mahasiswa" or $vtipeuser=="alumni") {
        if ($status=="Login sukses") {
          $_SESSION['npm']            = $v->npm;
          $_SESSION['nama_mahasiswa'] = $v->nama;
          $_SESSION['jurusan']        = $v->nm_jurusan;
          $_SESSION['session_user']   = $v->npm.$v->nama.$v->nm_jurusan;

          /**/
          
          foreach ($data_response->data as $v) {
              $npm            = $v->npm;
              $nama_mahasiswa = $v->nama;
              $tipeuser       = $v->tipeuser;
              $alamat         = $v->alamat;
              $nohp           = $v->nohp;
              $id_jurusan     = $v->id_jurusan;
              $angkatan       = $v->angkatan;
              $nm_jurusan     = $v->nm_jurusan;
              $jenjang        = $v->jenjang;
          }

          $npm = $_SESSION['npm'];

          $table = "mahasiswa";
          $field = "npm";
          $where = "npm = '$npm'";
          $data_mahasiswa = $this->mdata->select_custom($field,$table,$where);
          $count_data_mahasiswa = count($data_mahasiswa);
          
          if ($count_data_mahasiswa==0) {  //JIKA TIDAK DITEMUKAN DATA MAHASISWA PADA TABEL MAHASISWA
            $table = "mahasiswa";
            $data = array(
              'npm'            => $npm,
              'password'       => $password,
              'nama_mahasiswa' => $nama_mahasiswa,
              'tipeuser'       => $tipeuser,
              'alamat'         => $alamat,
              'nohp'           => $nohp,
              'id_jurusan'     => $id_jurusan,
              'angkatan'       => $angkatan,
              'nm_jurusan'     => $nm_jurusan,
              'jenjang'        => $jenjang,
            );
            $this->mdata->tambah_data($table,$data);
            
            $table_lulusan = "datalulusan";
            $datalulusan   = array(
              'npm'                  => $npm,
              'angkatan'             => "20".substr($npm, 0,2),
              'nama_mahasiswa'       => $nama_mahasiswa,
              'jenjang'              => $jenjang,
              'prodi'                => $nm_jurusan,
              'tahun_akademik_lulus' => $_SESSION['session_ta'],
            );
            $this->mdata->tambah_data($table_lulusan,$datalulusan);

          }elseif ($count_data_mahasiswa==1) {  // JIKA DITEMUKAN DATA MAHASISWA PADA TABEL MAHASISWA
            $table = "mahasiswa";
            $where = "npm = '$npm'";
            $data = array(
              'npm'            => $npm,
              'password'       => $password,
              'nama_mahasiswa' => $nama_mahasiswa,
              'tipeuser'       => $tipeuser,
              'alamat'         => $alamat,
              'nohp'           => $nohp,
              'id_jurusan'     => $id_jurusan,
              'angkatan'       => $angkatan,
              'nm_jurusan'     => $nm_jurusan,
              'jenjang'        => $jenjang,
            );
            $this->mdata->ubah_data($table,$where,$data);
            
            $table_lulusan = "datalulusan";
            $where = "npm = '$npm'";
            $datalulusan   = array(
              'npm'                  => $npm,
              'angkatan'             => "20".substr($npm, 0,2),
              'nama_mahasiswa'       => $nama_mahasiswa,
              'jenjang'              => $jenjang,
              'prodi'                => $nm_jurusan,
              'tahun_akademik_lulus' => $_SESSION['session_ta'],
            );
            $this->mdata->ubah_data($table_lulusan,$where,$datalulusan);
          }


          redirect(base_url()."index.php/mahasiswa/");
        }
    }else if ($vtipeuser=="alumni") {
        ?>
        <script>
              var txt;
              var r = confirm("Maaf, Anda sudah Alumni!");
              if (r == true) {
                window.location = "<?php echo base_url()?>index.php/welcome";
              } else {
                window.location = "<?php echo base_url()?>index.php/welcome";
              }
              document.getElementById("demo").innerHTML = txt;
        </script>
        <?php
    }
    
  }

  function login_curl_pasca($npm, $password){
    
    $post_data = 'username=' .$npm. '&password=' .$password;

    $ch = curl_init();
    //curl_setopt($ch, CURLOPT_URL, "http://118.97.23.184:8793/service_demo/api/apiserv/login/format/json");

    //curl_setopt($ch, CURLOPT_URL, "http://118.97.23.184:8793/service_demo/api/apiserv/login/format/json");
    
    // CURL AKTIF
    //curl_setopt($ch, CURLOPT_URL, "http://api.darmajaya.ac.id:8793/service_new/api/apiserv/login/format/json"); // S1
    curl_setopt($ch, CURLOPT_URL, "http://api.darmajaya.ac.id:8793/service_new/api/apiserv/login_pasca/format/json"); // S2

    curl_setopt($ch, CURLOPT_POST, 1);
    curl_setopt($ch, CURLOPT_POSTFIELDS, $post_data);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    $server_output = curl_exec($ch);
    $status = curl_getinfo($ch, CURLINFO_HTTP_CODE);

    // JIKA STATUS CURL TERPUTUS ATAU TIDAK BERFUNGSI MAKA LOGIN KE DATA LOCAL
    if ($status==0) {
      $this->mdata->login_local($npm, $password);
      exit();
    }

    //var_dump($server_output);
    $data_response = json_decode($server_output);

    // JIKA TIDAK DITEMUKAN DI LOGIN CURL S1 DAN S2 MAKA CARI KE LOGIN DALAM
    $status_login = isset($data_response->login_status);
    if ($status_login=='') {
      $this->mdata->login_local($npm, $password);
      exit();
    }

    //var_dump($data_response);
    //contoh ambil login status[true/false]
    //$data_response->login_status;

    //contoh parse message
    foreach ($data_response->message as $v) {
        $status = $v->info;
    }

    // JIKA DI CURL S2 ERROR MAKA KE LOGIN LOCAL
    if ($status=='Login gagal, username/password salah') {
      $this->mdata->login_local($npm, $password);
      exit();
    }

    // print_r data
    //echo"<pre>";
    //print_r($data_response->data);


    //contoh parse data mhs
    foreach ($data_response->data as $v) {
        $v->npm . ' ' . $v->nama . ' ' . $v->tipeuser. ' ' . $v->nm_jurusan;
    }
    //echo $data_response->login_status;
    $vtipeuser = strtolower($v->tipeuser);

    if ($vtipeuser=="mahasiswa" or $vtipeuser=="alumni") {
        if ($status=="Login sukses") {
          $_SESSION['npm']            = $v->npm;
          $_SESSION['nama_mahasiswa'] = $v->nama;
          $_SESSION['jurusan']        = $v->nm_jurusan;
          $_SESSION['session_user']   = $v->npm.$v->nama.$v->nm_jurusan;

          /**/
          
          foreach ($data_response->data as $v) {
              $npm            = $v->npm;
              $nama_mahasiswa = $v->nama;
              $tipeuser       = $v->tipeuser;
              $alamat         = $v->alamat;
              $nohp           = $v->nohp;
              $id_jurusan     = $v->id_jurusan;
              $angkatan       = $v->angkatan;
              $nm_jurusan     = $v->nm_jurusan;
              $jenjang        = $v->jenjang;
          }

          $npm = $_SESSION['npm'];

          $table = "mahasiswa";
          $field = "npm";
          $where = "npm = '$npm'";
          $data_mahasiswa = $this->mdata->select_custom($field,$table,$where);
          $count_data_mahasiswa = count($data_mahasiswa);
          
          if ($count_data_mahasiswa==0) {  //JIKA TIDAK DITEMUKAN DATA MAHASISWA PADA TABEL MAHASISWA
            $table = "mahasiswa";
            $data = array(
              'npm'            => $npm,
              'password'       => $password,
              'nama_mahasiswa' => $nama_mahasiswa,
              'tipeuser'       => $tipeuser,
              'alamat'         => $alamat,
              'nohp'           => $nohp,
              'id_jurusan'     => $id_jurusan,
              'angkatan'       => $angkatan,
              'nm_jurusan'     => $nm_jurusan,
              'jenjang'        => $jenjang,
            );
            $this->mdata->tambah_data($table,$data);
            
            $table_lulusan = "datalulusan";
            $datalulusan   = array(
              'npm'                  => $npm,
              'angkatan'             => "20".substr($npm, 0,2),
              'nama_mahasiswa'       => $nama_mahasiswa,
              'jenjang'              => $jenjang,
              'prodi'                => $nm_jurusan,
              'tahun_akademik_lulus' => $_SESSION['session_ta'],
            );
            $this->mdata->tambah_data($table_lulusan,$datalulusan);

          }elseif ($count_data_mahasiswa==1) {  // JIKA DITEMUKAN DATA MAHASISWA PADA TABEL MAHASISWA
            $table = "mahasiswa";
            $where = "npm = '$npm'";
            $data = array(
              'npm'            => $npm,
              'password'       => $password,
              'nama_mahasiswa' => $nama_mahasiswa,
              'tipeuser'       => $tipeuser,
              'alamat'         => $alamat,
              'nohp'           => $nohp,
              'id_jurusan'     => $id_jurusan,
              'angkatan'       => $angkatan,
              'nm_jurusan'     => $nm_jurusan,
              'jenjang'        => $jenjang,
            );
            $this->mdata->ubah_data($table,$where,$data);
            
            $table_lulusan = "datalulusan";
            $where = "npm = '$npm'";
            $datalulusan   = array(
              'npm'                  => $npm,
              'angkatan'             => "20".substr($npm, 0,2),
              'nama_mahasiswa'       => $nama_mahasiswa,
              'jenjang'              => $jenjang,
              'prodi'                => $nm_jurusan,
              'tahun_akademik_lulus' => $_SESSION['session_ta'],
            );
            $this->mdata->ubah_data($table_lulusan,$where,$datalulusan);
          }


          redirect(base_url()."index.php/mahasiswa/");
        }
    }else if ($vtipeuser=="alumni") {
        ?>
        <script>
              var txt;
              var r = confirm("Maaf, Anda sudah Alumni!");
              if (r == true) {
                window.location = "<?php echo base_url()?>index.php/welcome";
              } else {
                window.location = "<?php echo base_url()?>index.php/welcome";
              }
              document.getElementById("demo").innerHTML = txt;
        </script>
        <?php
    }
    
  }

  function login_local($npm, $password){
    //echo "local";
        $table = "mahasiswa";
        $where = "npm = '$npm' and password = '$password'";
        $data_response = $this->mdata->select_all_where($table,$where);

        $cek_data_response = count($data_response);
        if ($cek_data_response==1) {
          //echo "berhasil";
          foreach ($data_response as $session_login) {
            $_SESSION['npm']            = $session_login['npm'];
            $_SESSION['nama_mahasiswa'] = $session_login['nama_mahasiswa'];
            $_SESSION['jurusan']        = $session_login['nm_jurusan'];
            $_SESSION['session_user']   = $session_login['npm'].$session_login['nama_mahasiswa'].$session_login['nm_jurusan'];
          }

          $table_lulusan = "datalulusan";
                $where = "npm = '$npm'";
                $datalulusan   = array(
                  'tahun_akademik_lulus' => $_SESSION['session_ta'],
                );
                $this->mdata->ubah_data($table_lulusan,$where,$datalulusan);

          redirect(base_url()."index.php/mahasiswa/");
        }
        if ($cek_data_response!=1) {
          //echo "Login Gagal, Username / Password Anda Salah.";
          ?>
          <script>
            var r = confirm("Login Gagal, Username / Password Anda Salah. Silahkan kembali ke halaman login.");
            if (r == true) {
              window.location = "<?php echo base_url()?>index.php/welcome/";
            } else {
              window.location = "<?php echo base_url()?>index.php/welcome/";
            }
            document.getElementById("demo").innerHTML = txt;
          </script>
          <?php
        }
  }

}
?>