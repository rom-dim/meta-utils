DESCRIPTION = "cameracapture application" 
SECTION = "examples" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://LICENSE;md5=09acc6e6cbdfe3f8fe973748910d5499"

PR = "r0" 

DEPENDS = "dbus glib-2.0"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/rom-dim/bt-audio-sink.git;protocol=https"

S = "${WORKDIR}/git"

inherit pkgconfig cmake
