<!DOCTYPE html>
<html>
<head>
  <title></title>
  <link rel="stylesheet" href="<?php echo base_url()?>assets/css/w3.css">

</head>
<body background="<?php echo base_url()?>assets/img/mesjid.jpg">

  <div class="w3-container">

  <!--<h3>Lihat Hasil Setoran Hafalan</h3>-->
  <?php "User : ".$_SESSION['session_username']; ?>


  <?php foreach ($histori_setoran as $hs): ?>
    <div class="w3-panel w3-card w3-white w3-round-xlarge w3-small">
      <table style="padding: 10px 4px 10px 4px">
        <tr>
          <td>Mahasiswa</td>
          <td>:</td>
          <td><?php echo $hs['mahasiswa']?></td>
        </tr>
        <tr>
          <td>Nama Surat</td>
          <td>:</td>
          <td><?php echo $hs['surah_hafalan']?></td>
        </tr>
        <tr>
          <td>Ustad</td>
          <td>:</td>
          <td><?php echo $hs['ustad']?></td>
        </tr>
        <tr>
          <td>Keterangan</td>
          <td>:</td>
          <td><?php echo $hs['penilaian']?></td>
        </tr>
      </table>
    </div>
  <?php endforeach ?>

  </div>

  

<!--
  <a href="<?php echo base_url()?>index.php/welcome/logout">Logout</a>
  -->

</body>
</html>