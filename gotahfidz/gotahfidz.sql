-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 08 Agu 2019 pada 08.02
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gotahfidz`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `setoran_hafalan`
--

CREATE TABLE `setoran_hafalan` (
  `id_setoran_hafalan` int(11) NOT NULL,
  `mahasiswa` varchar(255) NOT NULL,
  `ustad` varchar(255) NOT NULL,
  `tipe_hafalan` varchar(100) NOT NULL,
  `surah_hafalan` varchar(100) NOT NULL,
  `penilaian` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `setoran_hafalan`
--

INSERT INTO `setoran_hafalan` (`id_setoran_hafalan`, `mahasiswa`, `ustad`, `tipe_hafalan`, `surah_hafalan`, `penilaian`) VALUES
(37, 'Muhammadrifki', 'Ustad Suratno', 'Sabqi', '97. Al-Qadr', 'Sangat Lancar');

-- --------------------------------------------------------

--
-- Struktur dari tabel `surah`
--

CREATE TABLE `surah` (
  `id_surah` int(11) NOT NULL,
  `nama_surah` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `surah`
--

INSERT INTO `surah` (`id_surah`, `nama_surah`) VALUES
(1, '67. Al-Mulk'),
(2, '68. Al-Qallam'),
(3, '69. Al-Haqqh'),
(4, '70. Al-Ma`arij'),
(5, '71. Nuh'),
(6, '72. Al-Jinn'),
(7, '73. Al-Muzzammil'),
(8, '74. Al-Muddassir'),
(9, '75. Al-Qiyamah'),
(10, '76. Al-Insan'),
(11, '77. Al-Mursalat'),
(12, '78. An-Naba'),
(13, '79.An-Naziat'),
(14, '80. `Abasa'),
(15, '81. At-Takwir'),
(16, '82. Al-Infitar'),
(17, '83. Al-Muthaffifin'),
(18, '84. Al-Insiqaq'),
(19, '85. Al-Buruj'),
(20, '86. At-Tariq'),
(21, '87. Al-A`la'),
(22, '88.Al-Ghasyiyah'),
(23, '89. Al-Fajr'),
(24, '90. Al-Balad'),
(25, '91. Asy-Syams'),
(26, '92. Al-Lail'),
(27, '93.Adh-Dhuha'),
(28, '94.Al-Linsyirah'),
(29, '95. Attin'),
(30, '96. Al-Alaq'),
(31, '97. Al-Qadr'),
(32, '98. Al-Bayyinah'),
(34, '99. Al-Zalzalah'),
(35, '100. Al-Adiyat'),
(36, '101. Al-Qari`ah'),
(37, '102. At-Takasur'),
(38, '103. Al-Asr'),
(41, '104. Al-Humazah'),
(42, '105. Al-Fil'),
(43, '106. Al-Quraish'),
(45, '107. Al-Maun'),
(47, '108. Al-Kautsar'),
(50, '109. Al-Kafirun'),
(51, '110. An-Nashr'),
(53, '111. Al-Lahab'),
(55, '112. Al-Ikhlas'),
(58, '113. Al-Falaq'),
(59, '114. An-Nas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nama_user` varchar(100) NOT NULL,
  `tipe_user` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`, `nama_user`, `tipe_user`) VALUES
('Ahmadlisan', 'ahmad123', 'Ahmad Lisan', 'Mahasiswa'),
('Ahmadriansyah', 'rian123', 'Ahmad Riyansyah', 'Mahasiswa'),
('Daniapriansyah', 'dani123', 'Dani Apriansyah', 'Mahasiswa'),
('Muhammadrifki', 'mrifki123', 'Muhhammad Rifki', 'Mahasiswa'),
('Ridhomukti', 'rido123', 'Rido Mukti', 'Mahasiswa'),
('Suhendro', 'hendro123', 'Suhendro', 'Mahasiswa'),
('tedipermana', 'tedi123', 'Tedi Permana', 'Mahasiswa'),
('UlilAbsor', 'ulil123', 'M Ulil Absor', 'Mahasiswa'),
('Ustad Musthofa', 'musthofa123', 'Musthofa Ahmad', 'Ustad'),
('Ustad Suratno', 'suratno123', 'Ustad Suratno', 'Ustad'),
('Ustad Syafiudin', 'syafiudin123', 'Ustd Syafi''Udin', 'Ustad'),
('ustad zakaria', 'zakaria123', 'Ustad Zakaria', 'Ustad'),
('Yogisaputra', 'yogi123', 'YogiSyaputra', 'Mahasiswa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `setoran_hafalan`
--
ALTER TABLE `setoran_hafalan`
  ADD PRIMARY KEY (`id_setoran_hafalan`),
  ADD KEY `mahasiswa` (`mahasiswa`),
  ADD KEY `ustad` (`ustad`);

--
-- Indexes for table `surah`
--
ALTER TABLE `surah`
  ADD PRIMARY KEY (`id_surah`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `setoran_hafalan`
--
ALTER TABLE `setoran_hafalan`
  MODIFY `id_setoran_hafalan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
--
-- AUTO_INCREMENT for table `surah`
--
ALTER TABLE `surah`
  MODIFY `id_surah` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `setoran_hafalan`
--
ALTER TABLE `setoran_hafalan`
  ADD CONSTRAINT `setoran_hafalan_ibfk_1` FOREIGN KEY (`mahasiswa`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `setoran_hafalan_ibfk_2` FOREIGN KEY (`ustad`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
