<!DOCTYPE html>
<html>
<head>
  <title></title>
  <style>
    button{
      border-radius: 8px;
      font-weight: bold !important;
      font-size: 18px !important;
    }
  </style>
  <link rel="stylesheet" href="<?php echo base_url()?>assets/css/w3.css">
</head>
<body background="<?php echo base_url()?>assets/img/mesjid.jpg">


  <div class="w3-container">
    <div align="center">
      <h3 style="color: white; font-weight: bold;">"Hasil Setoran Hafalan"</h3>
    </div>
    <?php "User : ".$_SESSION['session_username']; ?>

    <br>

    <p>
      <form action="<?php echo base_url()?>index.php/user/lihat_hasil_storan" method="post">
        <input type="text" name="nama_setoran" value="sabaq" hidden>
        <button class="w3-button w3-card w3-block w3-indigo">Sabaq</button>
      </form>
    </p>
    <p>
      <form action="<?php echo base_url()?>index.php/user/lihat_hasil_storan" method="post">
        <input type="text" name="nama_setoran" value="sabqi" hidden>
        <button class="w3-button w3-card w3-block w3-green">Sabqi</button>
      </form>
    </p>
    <p>
      <form action="<?php echo base_url()?>index.php/user/lihat_hasil_storan" method="post">
        <input type="text" name="nama_setoran" value="manzil" hidden>
        <button class="w3-button w3-card w3-block w3-red">Manzil</button>
      </form>
    </p>
    <div align="center">
      <a style="color: white !important" href="<?php echo base_url()?>index.php/welcome/logout">Logout</a>
    </div>
  </div>


</body>
</html>