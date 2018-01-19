CREATE TABLE users
(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    email varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);



CREATE TABLE IF NOT EXISTS `os` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `primary` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `bluetooth` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `wifi` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `audioJack` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
);


CREATE TABLE IF NOT EXISTS `usb` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
);

CREATE TABLE `PhoneDetail` (
    `additionalFeatures` text NOT NULL,
    `os_id` int NOT NULL,
    `ui` VARCHAR(255) NOT NULL,
    `standbyTime` VARCHAR(255) NOT NULL,
    `talkTime` VARCHAR(255) NOT NULL,
    `type` VARCHAR(255) NOT NULL,
    `primary_id` int NOT NULL,
    `bluetooth_id` int NOT NULL,
    `cell` VARCHAR(255) NOT NULL,
    `gps` BOOLEAN NOT NULL,
    `infrared` BOOLEAN NOT NULL,
    `wifi_id` int NOT NULL,
    `description` text NOT NULL,
    `screenResolution` VARCHAR(255) NOT NULL,
    `screenSize` VARCHAR(255) NOT NULL,
    `touchScreen` BOOLEAN NOT NULL,
    `accelerometer` BOOLEAN NOT NULL,
    `audioJack_id` int NOT NULL,
    `cpu` VARCHAR(255) NOT NULL,
    `fmRadio` BOOLEAN NOT NULL,
    `physicalKeyboard` BOOLEAN NOT NULL,
    `usb_id` int NOT NULL,
    `id` int NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `weight` VARCHAR(255) NOT NULL,
    `flash` VARCHAR(255) NOT NULL,
    `ram` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`os_id`) REFERENCES os(`id`),
    FOREIGN KEY (`primary_id`) REFERENCES `primary`(`id`),
    FOREIGN KEY (`bluetooth_id`) REFERENCES bluetooth(`id`),
    FOREIGN KEY (`wifi_id`) REFERENCES wifi(`id`),
    FOREIGN KEY (`audioJack_id`) REFERENCES audioJack(`id`),
    FOREIGN KEY (`usb_id`) REFERENCES usb(`id`)
);

CREATE TABLE IF NOT EXISTS `Phone` (
    `age` int NOT NULL,
    `carrier` varchar(255) NOT NULL,
    `id` int NOT NULL,
    `imageUrl` varchar(255) NOT NULL,
    `name` varchar(200) NOT NULL,
    `snippet` text NOT NULL,
    `phonedetail_id` int NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`phonedetail_id`) REFERENCES PhoneDetail (`id`)
);

CREATE TABLE IF NOT EXISTS `availability` (
    `id` int NOT NULL,
    PRIMARY KEY (`id`),
    `name` varchar(100) NOT NULL
);
CREATE TABLE IF NOT EXISTS `phone_availability` (
    `phonedetail_id` int NOT NULL,
    `availability_id` int NOT NULL,
    FOREIGN KEY (`phonedetail_id`) REFERENCES PhoneDetail (`id`),
    FOREIGN KEY (`availability_id`) REFERENCES availability (`id`)
);


CREATE TABLE `features` (
    `id` int NOT NULL,
    `name` varchar(100) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `phone_features` (
    `phonedetail_id` int NOT NULL,
    `features_id` int NOT NULL,
    FOREIGN KEY (`phonedetail_id`) REFERENCES PhoneDetail (`id`),
    FOREIGN KEY (`features_id`) REFERENCES features (`id`)
);

CREATE TABLE `images` (
    `id` int NOT NULL,
    `name` varchar(100) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `phone_images` (
    `phonedetail_id` int NOT NULL,
    `images_id` int NOT NULL,
    FOREIGN KEY (`phonedetail_id`) REFERENCES PhoneDetail (`id`),
    FOREIGN KEY (`images_id`) REFERENCES images(`id`)

);
CREATE TABLE `dimentions` (
    `id` int NOT NULL,
    `name` varchar(100) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `phone_dimentions` (
    `phonedetail_id` int NOT NULL,
    `dimentions_id` int NOT NULL,
    FOREIGN KEY (`phonedetail_id`) REFERENCES PhoneDetail (`id`),
    FOREIGN KEY (`dimentions_id`) REFERENCES dimentions (`id`)
);