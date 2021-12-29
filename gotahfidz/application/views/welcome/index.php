<!DOCTYPE html>
<html>
<head>
  <title></title>
  <link rel="stylesheet" href="<?php echo base_url()?>assets/css/w3.css">
</head>
<body>

  <form action="<?php echo base_url()?>index.php/welcome/login" method="post" class="w3-container">
    <h3>Lihat Hasil Setoran Hafalan</h3>
    <p align="justify">Masukkan username dan password anda untuk melihat nilai</p>

    <p>
      <label>Username</label>
      <input class="w3-input w3-border" name="username" type="text" required>
    </p>

    <p>
      <label>Password</label>
      <input class="w3-input w3-border" name="password" type="password" required>
    </p>

    <button class ="w3-btn w3-indigo w3-block" type="submit">Login</button>
    

  </form>

</body>
</html>