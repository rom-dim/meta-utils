#
# Yocto recipe to build a kernel module out of the kernel tree
# Dmitrij Belousov
# Dmitirj.Belousov@gmail.com
#

DESCRIPTION = "Linux kernel driver for Hitachi HD44780 LCDs attached to I2C bus via PCF8574 I/O expander"
SECTION = "lcd"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
PR = "r0"

inherit module

SRCREV = "${AUTOREV}"
SRC_URI =   "git://github.com/rom-dim/hd44780-i2c.git;protocol=http"

S = "${WORKDIR}/git"