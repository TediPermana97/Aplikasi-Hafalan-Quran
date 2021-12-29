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

    <form action="<?php echo base_url()?>index.php/ustad/test" method="post">
      <input class="w3-input" type="text" name="mahasiswa" list="mahasiswa" placeholder="Mahasiswa yang Dinilai" required>
      
      <select class="w3-input" name="tipe_hafalan" required>
        <option selected disabled>Jenis Hafalan</option>
        <option value="Sabaq">Sabaq</option>
        <option value="Sabqi">Sabqi</option>
        <option value="Manzil">Manzil</option>
      </select>

      <input class="w3-input" type="text" name="surah_hafalan" list="surah" placeholder="Surah" required>
      <select class="w3-input" name="penilaian" required>
        <option selected disabled>Penilaian</option>
        <option value="Belum Lancar">Belum Lancar</option>
        <option value="Lancar">Lancar</option>
        <option value="Sangat Lancar">Sangat Lancar</option>
      </select>

      <div align="center" style="margin-top: 10px;">
        <button class="w3-btn w3-indigo" style="border-radius: 8px;" type="submit">Simpan</button>
      </div>

      <datalist id="mahasiswa">
        <?php foreach ($mahasiswa as $m): ?>
          <option value="<?php echo $m['username']?>"><?php echo $m['nama_user']?></option>
        <?php endforeach ?>
      </datalist>

      <datalist id="surah">
        <?php foreach ($surah as $s): ?>
          <option value="<?php echo $s['nama_surah']?>"><?php echo $s['nama_surah']?></option>
        <?php endforeach ?>
      </datalist>
    </form>
    
    <hr>
    <?php $count_mhs_bimbingan = count($mahasiswa_bimbingan);
      if ($count_mhs_bimbingan==0) {
        // kosong
      }else if ($count_mhs_bimbingan1=0) {
        // ada isi
        ?>
           <p align="center" style="font-weight: bold; font-size: 16px">Daftar Mahasiswa</p>
        <?php
      }
    ?>

    <?php foreach ($mahasiswa_bimbingan as $mb): ?>
      <a href="<?php echo base_url()?>index.php/ustad/lihat_histori_hafalan?mahasiswa=<?php echo $mb['mahasiswa']; ?>">
        <div class="daftar_mahasiswa"><?php echo $mb['mahasiswa']; ?></div>
      </a>

    <?php endforeach ?>
    
    <div align="center" style="margin-top: 15px;">
      <a style="color: gray !important" href="<?php echo base_url()?>index.php/welcome/logout">Logout</a>
    </div>

  </div>



</body>
</html>