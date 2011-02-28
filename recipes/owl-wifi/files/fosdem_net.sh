#!/bin/sh
ifconfig owl0 up
#iwlist owl0 scan
iwconfig owl0 key s:ALLANTARKAKAN [1] restricted
iwconfig owl0 essid Bedinge
udhcpc -i owl0

ifconfig owl0 up
#iwlist owl0 scan
iwconfig owl0 key s:ALLANTARKAKAN [1] restricted
iwconfig owl0 essid Bedinge
udhcpc -i owl0

