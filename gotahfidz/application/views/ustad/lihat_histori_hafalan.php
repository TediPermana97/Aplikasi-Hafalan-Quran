<!DOCTYPE html>
<html>
<head>
	<title>Lihat Histori Hafalan</title>
	<link rel="stylesheet" href="<?php echo base_url()?>assets/css/w3.css">

</head>
<body background="<?php echo base_url()?>assets/img/mesjid.jpg">

	<div class="w3-container">
		<?php foreach ($histori_setoran as $hs): ?>
			<div class="w3-panel w3-card w3-white w3-round-xlarge w3-small">
				<table width="100%">
					<tr>
						<td>Mahasiswa</td>
						<td>:</td>
						<td>
							<?php
								echo $hs['mahasiswa'];
								$_SESSION["mahasiswa"] = $hs['mahasiswa'];;
							?>
						</td>
					</tr>
					<tr>
						<td>Tipe Hafalan</td>
						<td>:</td>
						<td><?php echo $hs['tipe_hafalan']?></td>
					</tr>
					<tr>
						<td>Surah Hafalan</td>
						<td>:</td>
						<td><?php echo $hs['surah_hafalan']?></td>
					</tr>
					<tr>
						<td>Ustad</td>
						<td>:</td>
						<td><?php echo $hs['ustad']?></td>
					</tr>
					<tr>
						<td>Penilaian</td>
						<td>:</td>
						<td><?php echo $hs['penilaian']?></td>
					</tr>
					<tr>
						<td colspan="3" align="right">
							<td>
								<form action="<?php echo base_url()?>index.php/ustad/form_hapus?id_hapus=<?php echo $hs['id_setoran_hafalan'] ?>" method="post">
									<button type="submit" style="border-radius: 8px !important" class="w3-btn w3-indigo">Hapus</button>
								</form>
							</td>
						</td>
					</tr>
				</table>
			</div>
		<?php endforeach ?>

		<?php if (count($histori_setoran)==0): ?>
			<div style="padding: 30px;" align="center">Belum ada data <a class="w3-btn w3-tiny w3-red" href="<?php echo base_url()?>index.php/ustad">Kembali</a></div>
		<?php endif ?>

	</div>

	<script>
		function myFunction(id) {
			var r = confirm("Apakah Kamu yakin ingin menghapus id : "+id);
			if (r == true) {

				window.location = '<?php echo base_url()?>index.php/ustad/aksi_hapus?id='+id;
			} else {
				
			}

		}
	</script>

</body>
</html>