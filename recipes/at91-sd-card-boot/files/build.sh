#!/bin/sh

process	()
{
	if [ -f $1.machid ] ; then
		mkimage -A arm -O linux -T script -C none -a 0 -e 0 -n "$1 machid script" -d $1.machid U-BOOT.ENV
	fi
}

process	at91sam9g45ekes
process	at91sam9m10ekes
process	at91sam9m10g45ek
process	at91sam9m10g45ek_android



