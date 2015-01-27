-- phpMyAdmin SQL Dump
-- version 4.0.10.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Czas wygenerowania: 27 Sty 2015, 16:12
-- Wersja serwera: 5.0.96
-- Wersja PHP: 5.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza danych: `sevik`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `pacients`
--

CREATE TABLE IF NOT EXISTS `pacients` (
  `ID` int(11) NOT NULL auto_increment,
  `fname` varchar(30) default NULL,
  `lname` varchar(30) default NULL,
  `bdate` date default '0001-01-01',
  `pesel` varchar(12) default NULL,
  `address_city` varchar(50) default NULL,
  `place` varchar(40) default NULL,
  `o_oczu` varchar(40) default NULL,
  `r_slowna` varchar(40) default NULL,
  `r_ruchowa` varchar(30) default NULL,
  `cz_odech` varchar(30) default NULL,
  `rr_skurcz` varchar(30) default NULL,
  `gcs` varchar(30) default NULL,
  `dusznosc` varchar(30) default NULL,
  `sinica` varchar(30) default NULL,
  `bezdech` varchar(30) default NULL,
  `szmer` varchar(30) default NULL,
  `furczenie` varchar(30) default NULL,
  `swisty` varchar(30) default NULL,
  `trzeszczenie` varchar(30) default NULL,
  `rzezenie` varchar(30) default NULL,
  `brak_szmeru` varchar(30) default NULL,
  `inne` varchar(30) default NULL,
  `reakcja_1` varchar(30) default NULL,
  `reakcja_2` varchar(30) default NULL,
  `reakcja_3` varchar(30) default NULL,
  `szer_1` varchar(30) default NULL,
  `szer_2` varchar(30) default NULL,
  `szer_3` varchar(30) default NULL,
  `tetno` varchar(30) default NULL,
  `wyglad` varchar(30) default NULL,
  `wilgotnosc` varchar(30) default NULL,
  `temp` varchar(30) default NULL,
  `brzuch` varchar(30) default NULL,
  `ocena_psych` varchar(30) default NULL,
  `tony_serca` varchar(30) default NULL,
  `zapach` varchar(30) default NULL,
  `niedowlad` varchar(30) default NULL,
  `konczyna_g` varchar(30) default NULL,
  `konczyna_d` varchar(30) default NULL,
  `ekg` text,
  `czynnosci` text,
  `obr_anatomiczne` text,
  `decyzja` varchar(30) default NULL,
  `dokument` varchar(100) default NULL,
  `oznaczenie_dysp` varchar(50) default NULL,
  `kod_zrm` varchar(20) default NULL,
  `nr_zlec` varchar(20) default NULL,
  `ident_nfz` varchar(10) default NULL,
  `data_udziel_pom` date default NULL,
  `przekaz_pacjenta` date default NULL,
  `przekaz_godz` varchar(3) default NULL,
  `przekaz_min` varchar(3) default NULL,
  `zgon_odstap_godz` varchar(3) default NULL,
  `zgon_odstap_min` varchar(3) default NULL,
  `wywiad` text,
  `saturacja` varchar(3) default NULL,
  `cisnienie_1` varchar(4) default NULL,
  `cisnienie_2` varchar(4) default NULL,
  `tetno_min` varchar(4) default NULL,
  `glukoza_1` varchar(10) default NULL,
  `glukoza_2` varchar(10) default NULL,
  `inne_dokl` varchar(100) default NULL,
  `rozpoznanie` text,
  `zalecenia_uwagi` text,
  `zast_leki` text,
  `icd10_1` varchar(8) default NULL,
  `icd10_2` varchar(8) default NULL,
  `icd10_3` varchar(8) default NULL,
  `opis` text,
  `zgon_odstap` date default NULL,
  `ulica` varchar(100) default NULL,
  `ulica_nr` varchar(5) default NULL,
  `ulica_m` varchar(10) default NULL,
  `objawy` text NOT NULL,
  `objawy_inne` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin2 AUTO_INCREMENT=29 ;

--
-- Zrzut danych tabeli `pacients`
--

INSERT INTO `pacients` (`ID`, `fname`, `lname`, `bdate`, `pesel`, `address_city`, `place`, `o_oczu`, `r_slowna`, `r_ruchowa`, `cz_odech`, `rr_skurcz`, `gcs`, `dusznosc`, `sinica`, `bezdech`, `szmer`, `furczenie`, `swisty`, `trzeszczenie`, `rzezenie`, `brak_szmeru`, `inne`, `reakcja_1`, `reakcja_2`, `reakcja_3`, `szer_1`, `szer_2`, `szer_3`, `tetno`, `wyglad`, `wilgotnosc`, `temp`, `brzuch`, `ocena_psych`, `tony_serca`, `zapach`, `niedowlad`, `konczyna_g`, `konczyna_d`, `ekg`, `czynnosci`, `obr_anatomiczne`, `decyzja`, `dokument`, `oznaczenie_dysp`, `kod_zrm`, `nr_zlec`, `ident_nfz`, `data_udziel_pom`, `przekaz_pacjenta`, `przekaz_godz`, `przekaz_min`, `zgon_odstap_godz`, `zgon_odstap_min`, `wywiad`, `saturacja`, `cisnienie_1`, `cisnienie_2`, `tetno_min`, `glukoza_1`, `glukoza_2`, `inne_dokl`, `rozpoznanie`, `zalecenia_uwagi`, `zast_leki`, `icd10_1`, `icd10_2`, `icd10_3`, `opis`, `zgon_odstap`, `ulica`, `ulica_nr`, `ulica_m`, `objawy`, `objawy_inne`) VALUES
(1, 'a', 'adamczuk', '2014-12-30', '1234567890', 'Chrząszcz', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(2, 'Adam', 'Male', '0001-01-01', NULL, 'Kraków', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(3, 'adam', 'malee', '0001-01-01', '', 'Warszawa', 'w domu', '[2] na ból', '[1] brak', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(4, 'Ignacy', 'Moscicki', '2007-07-03', '1234567890', NULL, 'w domu', '[1] brak', '[5] zorientowany', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(5, 'eda', 'aaa', '2014-12-04', '', NULL, 'w pracy', '[2] na ból', '[2] niezrozumiałe dźwięki', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(6, 'igor', 'male', '2015-01-16', '123444123', NULL, '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(12, 'adaaa', 'ma', '0001-01-01', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(15, 'alan', 'anders', '0001-01-01', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', ''),
(16, 'aa', 'asd', '2015-01-01', '', 'qwe', 'w ruchu uliczno-drog', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Przyjęcie pacjenta', 'aswq sad', 'asdqwe', '2556', '123', 'asd', '0001-01-01', '0001-01-01', '2', '2', '3', '1', 'wadsa', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', 'asd', 'as', '12a', '', ''),
(17, '', '', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(28, 'Sławomir', 'Nowak', '0001-01-01', '', '', '', '[3] na głos', '[3] niewłaściwe słowa', '[5] lokalizacja bólu', '[3] >29', '[1] 1-49', '[3] 9-12', '', '', 'P', '', 'LP', 'L', '', '', 'LP', '', 'LP', 'LP', 'LP', 'P', 'L', '', '', 'sinica obw', 'sucha', 'ciepła', 'brak perystaltyki', '', '', 'alkohol', '', '', 'P', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', 'drgawki;krwawienie;zasłabnięcie;', 'ciąża;'),
(18, 'Jan', 'Kowalski', '1993-01-15', '93011523345', 'Kraków', 'w domu', '[4] spontanicznie', '[5] zorientowany', '[6] wykonuje polecenia', '[4] 10-29', '[4] >89', '[4] 13-15', 'L', 'P', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'LP', 'miarowe', 'w normie', 'w normie', 'w normie', 'w normie', 'w normie', 'czyste/głośne', 'rozpuszczalnik org', 'NIEDOWŁAD / PORAŻENIE', 'LP', 'LP', 'Rytm zatokowy;Tachykardia komorowa;Asystolia;Zawał;Inne:;', 'odsysanie;rurka UG;respirator;linia żyl. obw.;kardiowersja;deska ortoped;opatrunek;cewnikowanie;', '<html>penetrujące rany głowy i tułowia lub urazy<br/> tępe z objawami uszkodzenia narządów<br/> wewnętrznych głowy, klatki piersiowej i brzucha</html>;amputacja kończyny powyżej kolana lub łokcia;rozległe zmiażdżenia kończyn;uszkodzienie rdzenia kręgowego;<html>złamanie kończyny z <br/>uszkodzeniem naczyń i nerwów</html>;<html>złamanie co najmniej<br/> dwóch proksymalnych<br/> kości długich kończyn lub miednicy</html>;', 'Przyjęcie pacjenta', 'Dowód osobisty ASP24534', 'Oznaczenie1', '111', '1', '1', '2015-01-03', '2015-01-03', '16', '16', '16', '34', 'Jakiś randomowy tekst', '67', '234', '23', '23', '23', '23', 'losowe', 'kolejny losowy opis', 'Jakieś zalecenia', 'Jakieś zalecenia', '12', '12', '13', 'jakis losowy opis', '2015-01-23', 'jakaś ulica', '3', 'b', 'obj. oponowe;biegunka;obrzęki;zasłabnięcie;', 'choroba zakaźna;'),
(19, 'adam', 'asnyk', '2015-01-08', '1232131', 'qwe', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '1', '2015-01-16', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(20, 'aleksander', 'fredro', '2015-01-07', '987456123', '', 'w pracy', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '2015-01-07', '13', '22', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(21, 'Maciek', 'Musiał', '0001-01-01', '123678998', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '123', '0001-01-01', '2015-01-22', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(22, 'Marek', 'Mus', '2015-01-21', '', '', 'w pracy', '[4] spontanicznie', '[4] splątany', '[2] wyprostna', '', '[4] >89', '', '', '', 'L', '', 'LP', 'P', '', '', '', '', '', '', 'L', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(23, 'Patrycja', 'ABC', '2015-01-24', '43556789', '', 'w pracy', '', '[2] niezrozumiałe dźwięki', '[6] wykonuje polecenia', '[4] 10-29', '[2] 50-75', '', '', '', '', '', 'L', 'LP', 'LP', '', '', '', '', '', '', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '123', '0001-01-01', '2015-01-07', '23', '23', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(24, '', '', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(25, 'Przemysław', 'Wajcha', '0001-01-01', '92031911998', 'Kraków', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(26, 'Przemysław', 'Dębiec', '0001-01-01', '65052314971', 'Kraków', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', ''),
(27, 'Adam', 'Dębiec', '0001-01-01', '62082855943', 'Kraków', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '0001-01-01', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0001-01-01', '', '', '', '', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
