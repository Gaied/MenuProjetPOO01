-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 11 déc. 2019 à 17:35
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_vehicule`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `idClient` int(6) NOT NULL,
  `nom` char(12) NOT NULL,
  `prenom` char(12) NOT NULL,
  `adresse` char(30) DEFAULT NULL,
  `codePostal` char(12) DEFAULT NULL,
  `ville` char(12) DEFAULT NULL,
  `tel` int(14) NOT NULL,
  `typeClient` enum('Client atelier','Client vente') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `devisvehicule`
--

CREATE TABLE `devisvehicule` (
  `idDevisV` int(6) NOT NULL,
  `Prix` double NOT NULL,
  `dateDevis` date DEFAULT NULL,
  `idProfil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE `facture` (
  `idFacture` int(10) NOT NULL,
  `prix` double NOT NULL,
  `idFiche` int(11) DEFAULT NULL,
  `dateFacture` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `ficheentretien`
--

CREATE TABLE `ficheentretien` (
  `idFiche` int(6) NOT NULL,
  `marqueV` char(20) NOT NULL,
  `numero` int(20) NOT NULL,
  `description` char(25) NOT NULL,
  `accepte` tinyint(1) NOT NULL,
  `cloture` tinyint(1) NOT NULL,
  `idClient` int(11) DEFAULT NULL,
  `idProfil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `pieces`
--

CREATE TABLE `pieces` (
  `idPiece` int(6) NOT NULL,
  `typePiece` char(50) DEFAULT NULL,
  `finTache` tinyint(1) NOT NULL,
  `description` char(100) NOT NULL,
  `idTache` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `profils`
--

CREATE TABLE `profils` (
  `idProfil` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `stockpieces`
--

CREATE TABLE `stockpieces` (
  `idStockP` int(6) NOT NULL,
  `qtePieces` int(6) NOT NULL,
  `type_pieces` char(12) NOT NULL,
  `idProfil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `stockvehicule`
--

CREATE TABLE `stockvehicule` (
  `idStockV` int(6) NOT NULL,
  `nbrVoiture` int(10) NOT NULL,
  `marque` char(10) DEFAULT NULL,
  `idProfil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `taches`
--

CREATE TABLE `taches` (
  `idTache` int(6) NOT NULL,
  `details` char(100) DEFAULT NULL,
  `finTache` tinyint(1) NOT NULL,
  `idProfil` int(11) DEFAULT NULL,
  `idFiche` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

CREATE TABLE `utilisateurs` (
  `idUtil` int(6) NOT NULL,
  `nom` char(12) NOT NULL,
  `prenom` char(12) NOT NULL,
  `tel` char(12) NOT NULL,
  `administrateur` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `utilprofil`
--

CREATE TABLE `utilprofil` (
  `idProfil` int(11) DEFAULT NULL,
  `idutil` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`idClient`);

--
-- Index pour la table `devisvehicule`
--
ALTER TABLE `devisvehicule`
  ADD PRIMARY KEY (`idDevisV`),
  ADD KEY `idProfil` (`idProfil`);

--
-- Index pour la table `facture`
--
ALTER TABLE `facture`
  ADD PRIMARY KEY (`idFacture`),
  ADD KEY `idFiche` (`idFiche`);

--
-- Index pour la table `ficheentretien`
--
ALTER TABLE `ficheentretien`
  ADD PRIMARY KEY (`idFiche`),
  ADD KEY `idClient` (`idClient`),
  ADD KEY `idProfil` (`idProfil`);

--
-- Index pour la table `pieces`
--
ALTER TABLE `pieces`
  ADD PRIMARY KEY (`idPiece`),
  ADD KEY `idTache` (`idTache`);

--
-- Index pour la table `profils`
--
ALTER TABLE `profils`
  ADD PRIMARY KEY (`idProfil`);

--
-- Index pour la table `stockpieces`
--
ALTER TABLE `stockpieces`
  ADD PRIMARY KEY (`idStockP`),
  ADD KEY `idProfil` (`idProfil`);

--
-- Index pour la table `stockvehicule`
--
ALTER TABLE `stockvehicule`
  ADD PRIMARY KEY (`idStockV`),
  ADD KEY `idProfil` (`idProfil`);

--
-- Index pour la table `taches`
--
ALTER TABLE `taches`
  ADD PRIMARY KEY (`idTache`),
  ADD KEY `idProfil` (`idProfil`),
  ADD KEY `idFiche` (`idFiche`);

--
-- Index pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  ADD PRIMARY KEY (`idUtil`);

--
-- Index pour la table `utilprofil`
--
ALTER TABLE `utilprofil`
  ADD KEY `idProfil` (`idProfil`),
  ADD KEY `idutil1` (`idutil`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `idClient` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `devisvehicule`
--
ALTER TABLE `devisvehicule`
  MODIFY `idDevisV` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `facture`
--
ALTER TABLE `facture`
  MODIFY `idFacture` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `ficheentretien`
--
ALTER TABLE `ficheentretien`
  MODIFY `idFiche` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `pieces`
--
ALTER TABLE `pieces`
  MODIFY `idPiece` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `profils`
--
ALTER TABLE `profils`
  MODIFY `idProfil` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `stockpieces`
--
ALTER TABLE `stockpieces`
  MODIFY `idStockP` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `stockvehicule`
--
ALTER TABLE `stockvehicule`
  MODIFY `idStockV` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `taches`
--
ALTER TABLE `taches`
  MODIFY `idTache` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  MODIFY `idUtil` int(6) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `devisvehicule`
--
ALTER TABLE `devisvehicule`
  ADD CONSTRAINT `devisvehicule_ibfk_1` FOREIGN KEY (`idProfil`) REFERENCES `profils` (`idProfil`);

--
-- Contraintes pour la table `facture`
--
ALTER TABLE `facture`
  ADD CONSTRAINT `facture_ibfk_1` FOREIGN KEY (`idFiche`) REFERENCES `ficheentretien` (`idFiche`);

--
-- Contraintes pour la table `ficheentretien`
--
ALTER TABLE `ficheentretien`
  ADD CONSTRAINT `ficheentretien_ibfk_1` FOREIGN KEY (`idClient`) REFERENCES `clients` (`idClient`),
  ADD CONSTRAINT `ficheentretien_ibfk_2` FOREIGN KEY (`idProfil`) REFERENCES `profils` (`idProfil`);

--
-- Contraintes pour la table `pieces`
--
ALTER TABLE `pieces`
  ADD CONSTRAINT `pieces_ibfk_1` FOREIGN KEY (`idTache`) REFERENCES `taches` (`idTache`);

--
-- Contraintes pour la table `stockpieces`
--
ALTER TABLE `stockpieces`
  ADD CONSTRAINT `stockpieces_ibfk_1` FOREIGN KEY (`idProfil`) REFERENCES `profils` (`idProfil`);

--
-- Contraintes pour la table `stockvehicule`
--
ALTER TABLE `stockvehicule`
  ADD CONSTRAINT `stockvehicule_ibfk_1` FOREIGN KEY (`idProfil`) REFERENCES `profils` (`idProfil`);

--
-- Contraintes pour la table `taches`
--
ALTER TABLE `taches`
  ADD CONSTRAINT `taches_ibfk_1` FOREIGN KEY (`idProfil`) REFERENCES `profils` (`idProfil`),
  ADD CONSTRAINT `taches_ibfk_2` FOREIGN KEY (`idFiche`) REFERENCES `ficheentretien` (`idFiche`);

--
-- Contraintes pour la table `utilprofil`
--
ALTER TABLE `utilprofil`
  ADD CONSTRAINT `idutil1` FOREIGN KEY (`idutil`) REFERENCES `utilisateurs` (`idUtil`),
  ADD CONSTRAINT `utilprofil_ibfk_1` FOREIGN KEY (`idProfil`) REFERENCES `profils` (`idProfil`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
