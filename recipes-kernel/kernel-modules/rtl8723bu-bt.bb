LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

#SRCREV = "${AUTOREV}"
#SRCREV = "wilc_linux_15_01"
#SRCREV = "02eb0f62928a97790322b001f3b0e5294dea0522"

SRC_URI = " file://EW-7611ULB_Linux_Bluetooth_Driver_1.0.0.9.tar.gz \
            "

            
#RPROVIDES_${PN} += "kernel-module-rtl8723ab-bt"
MODULES_MODULE_SYMVERS_LOCATION = "/bluetooth_usb_driver"
#S = "${WORKDIR}/git/Linux_BT_USB_2.11.20140423_8723BE/"
S = "${WORKDIR}/EW-7611ULB_Linux_Bluetooth_Driver_1.0.0.9"

FILES_${PN}_append = " /lib/firmware/rtl8723*"

do_install_append() {
    install -d ${D}/lib/firmware
    install -m 0755 ${S}/8723BU/rtl8723b_fw ${D}/lib/firmware/rtl8723b_fw
    install -m 0755 ${S}/8723BU/rtl8723bu_config ${D}/lib/firmware/rtl8723bu_config
    
}
