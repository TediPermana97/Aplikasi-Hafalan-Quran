<!DOCTYPE html>
<html>
<head>
  <title></title>
  <link rel="stylesheet" href="<?php echo base_url()?>assets/css/w3.css">

  <style>
    .daftar_mahasiswa{
      font-size: 14px;
      border-radius: 8px;
      background-color: indigo;
      padding: 5px 5px 5px 20px;
      margin: 5px;
      color: white;
      font-weight: bold;
    }
    a{
      text-decoration: none;
    }
  </style>

</head>
<body background="<?php echo base_url()?>assets/img/mesjid.jpg">


  <div class="w3-container">
    <!--<h3>Set Nilai</h3>-->
    <?php "User : ".$_SESSION['session_username']; ?>

    <center>
	<div style="margin: 40px; padding: 10px; background-color: white; border-radius: 10px; width: 100%; max-width: 350px" align="center">
		Apakah anda yakin akan menghapusnya ?
		<a class="w3-btn w3-small w3-indigo" href="<?php echo base_url()?>index.php/ustad/aksi_hapus?id_hapus=<?php echo $_GET['id_hapus'] ?>">Hapus</a>
		<a class="w3-btn w3-small w3-red" href="<?php echo base_url()?>index.php/ustad/lihat_histori_hafalan?mahasiswa=<?php echo $_SESSION['mahasiswa'] ?>">Kembali</a>
	</div>    
	</center>
    
    <div align="center" style="margin-top: 15px;">
      <a style="color: gray !important" href="<?php echo base_url()?>index.php/welcome/logout">Logout</a>
    </div>

  </div>



</body>
</html>