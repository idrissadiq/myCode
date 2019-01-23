##########################################################################
#	This program runs on an LED matrix controller project that is
#	designed using several GPIOs on the Raspberry Pi 2 Model B as
#	well as LEDs and a Sony DualShock 4 game controller.
#
#	When connecting the controller to the Pi's USB port, this program
#	will map buttons presses to different LED array patterns. 
#	This code can be modified to work with any USB game controller	
#	and similar Pi configuration, however the LED array patterns must
#	also be reconfigured. 
#
#	Project demo can be found on my project website http://idrissadiq.com
#	
#	Developed by: Idris Sadiq
#	4/17/2017
##########################################################################

import pygame
import pygame.mixer
import RPi.GPIO as GPIO
import time
from sys import exit

GPIO.setmode(GPIO.BCM)		# Assign GPIOs to Broadcom SoC channel mapping
GPIO.setup(27, GPIO.OUT)	# Set GPIO pin mode to output
GPIO.setup(25, GPIO.OUT)	# Each pin corresponds to an LED
GPIO.setup(23, GPIO.OUT)
GPIO.setup(22, GPIO.OUT)
GPIO.setup(21, GPIO.OUT)
GPIO.setup(20, GPIO.OUT)
GPIO.setup(19, GPIO.OUT)
GPIO.setup(18, GPIO.OUT)
GPIO.setup(17, GPIO.OUT)
GPIO.setup(16, GPIO.OUT)
GPIO.setup(13, GPIO.OUT)
GPIO.setup(12, GPIO.OUT)
GPIO.setup(6, GPIO.OUT)
GPIO.setup(5, GPIO.OUT)
GPIO.setup(4, GPIO.OUT)

pygame.init()					# Initialize all pygame modules
j = pygame.joystick.Joystick(0)	# Joystick object for USB controllers
j.init()

try:
    while True:
        events = pygame.event.get()	# Returns a queue of events
        for event in events:
            if event.type == pygame.JOYBUTTONDOWN:
                
				# Check for button presses 
				if j.get_button(0):		# X Button
		            GPIO.output(23, GPIO.HIGH)
                
				if j.get_button(1):		# Circle Button 
				    GPIO.output(25, GPIO.HIGH)
		        
				if j.get_button(2):		# Triangle Button
                    GPIO.output(27, GPIO.HIGH)
				
				if j.get_button(3):		# Square Button
                    GPIO.output(5, GPIO.HIGH)
                
				if j.get_button(4):		# L1 Button
                    GPIO.output(4, GPIO.HIGH)
				
				if j.get_button(5):		# R1 Button
                    GPIO.output(18, GPIO.HIGH)
					GPIO.output(19, GPIO.HIGH)
					GPIO.output(20, GPIO.HIGH)
					GPIO.output(21, GPIO.HIGH)
					GPIO.output(22, GPIO.HIGH)
                
				if j.get_button(6):		# L2 Button
                    GPIO.output(6, GPIO.HIGH)
		            GPIO.output(12, GPIO.HIGH)
		            GPIO.output(13, GPIO.HIGH)
		            GPIO.output(16, GPIO.HIGH)
		            GPIO.output(17, GPIO.HIGH)
		        
				if j.get_button(7):		# R2 Button
                    GPIO.output(23, GPIO.HIGH)
		            time.sleep(0.03)
		            GPIO.output(23, GPIO.LOW)
		            GPIO.output(25, GPIO.HIGH)
		            time.sleep(0.03)
                    GPIO.output(25, GPIO.LOW)
		            GPIO.output(27, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(27, GPIO.LOW)
		            GPIO.output(22, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(22, GPIO.LOW)
		            GPIO.output(21, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(21, GPIO.LOW)
		            GPIO.output(20, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(20, GPIO.LOW)
                    GPIO.output(19, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(19, GPIO.LOW)
                    GPIO.output(18, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(18, GPIO.LOW)
                    GPIO.output(6, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(6, GPIO.LOW)
		            GPIO.output(12, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(12, GPIO.LOW)
                    GPIO.output(13, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(13, GPIO.LOW)
                    GPIO.output(16, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(16, GPIO.LOW)
                    GPIO.output(17, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(17, GPIO.LOW)
                    GPIO.output(5, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(5, GPIO.LOW)
                    GPIO.output(4, GPIO.HIGH)
                    time.sleep(0.03)
                    GPIO.output(4, GPIO.LOW)
		
		        if j.get_button(8):		# Share Button
                    GPIO.output(4, GPIO.HIGH)
		            GPIO.output(5, GPIO.HIGH)
		            time.sleep(0.075)
		            GPIO.output(4, GPIO.LOW)
		            GPIO.output(5, GPIO.LOW)
		            GPIO.output(6, GPIO.HIGH)
                    GPIO.output(12, GPIO.HIGH)
		            GPIO.output(13, GPIO.HIGH)
                    GPIO.output(16, GPIO.HIGH)
		            GPIO.output(17, GPIO.HIGH)
		            time.sleep(0.075)
		            GPIO.output(6, GPIO.LOW)
                    GPIO.output(12, GPIO.LOW)
                    GPIO.output(13, GPIO.LOW)
                    GPIO.output(16, GPIO.LOW)
                    GPIO.output(17, GPIO.LOW)
		            GPIO.output(18, GPIO.HIGH)
                    GPIO.output(19, GPIO.HIGH)
                    GPIO.output(20, GPIO.HIGH)
                    GPIO.output(21, GPIO.HIGH)
                    GPIO.output(22, GPIO.HIGH)
		            time.sleep(0.075)
		            GPIO.output(18, GPIO.LOW)
                    GPIO.output(19, GPIO.LOW)
                    GPIO.output(20, GPIO.LOW)
                    GPIO.output(21, GPIO.LOW)
                    GPIO.output(22, GPIO.LOW)
		            GPIO.output(23, GPIO.HIGH)
                    GPIO.output(25, GPIO.HIGH)
                    GPIO.output(27, GPIO.HIGH)
		            time.sleep(0.075)
		            GPIO.output(23, GPIO.LOW)
                    GPIO.output(25, GPIO.LOW)
                    GPIO.output(27, GPIO.LOW)
		
		        if j.get_button(9):		# Options Button
                    GPIO.output(4, GPIO.HIGH)
		            GPIO.output(5, GPIO.HIGH)
		
		        if j.get_button(10):	# PS Button
                    GPIO.output(23, GPIO.HIGH)
                    GPIO.output(25, GPIO.HIGH)
		            GPIO.output(27, GPIO.HIGH)
		
		        if j.get_button(11):	# L3 Button
                    GPIO.output(4, GPIO.HIGH)
                    GPIO.output(6, GPIO.HIGH)
                    GPIO.output(18, GPIO.HIGH)
                    GPIO.output(23, GPIO.HIGH)
		            time.sleep(0.075)
                    GPIO.output(4, GPIO.LOW)
                    GPIO.output(6, GPIO.LOW)
                    GPIO.output(18, GPIO.LOW)
                    GPIO.output(23, GPIO.LOW)
                    GPIO.output(12, GPIO.HIGH)
                    GPIO.output(19, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(12, GPIO.LOW)
                    GPIO.output(19, GPIO.LOW)
                    GPIO.output(13, GPIO.HIGH)
                    GPIO.output(20, GPIO.HIGH)
                    GPIO.output(25, GPIO.HIGH)
		            time.sleep(0.075)
                    GPIO.output(13, GPIO.LOW)
                    GPIO.output(20, GPIO.LOW)
                    GPIO.output(25, GPIO.LOW)
		            GPIO.output(16, GPIO.HIGH)
                    GPIO.output(21, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(16, GPIO.LOW)
                    GPIO.output(21, GPIO.LOW)
                    GPIO.output(5, GPIO.HIGH)
                    GPIO.output(17, GPIO.HIGH)
                    GPIO.output(22, GPIO.HIGH)
                    GPIO.output(27, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(5, GPIO.LOW)
                    GPIO.output(17, GPIO.LOW)
                    GPIO.output(22, GPIO.LOW)
                    GPIO.output(27, GPIO.LOW)
		
		        if j.get_button(12):	# R3 Button
                    GPIO.output(5, GPIO.HIGH)
                    GPIO.output(17, GPIO.HIGH)
                    GPIO.output(22, GPIO.HIGH)
                    GPIO.output(27, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(5, GPIO.LOW)
                    GPIO.output(17, GPIO.LOW)
                    GPIO.output(22, GPIO.LOW)
                    GPIO.output(27, GPIO.LOW)
                    GPIO.output(16, GPIO.HIGH)
                    GPIO.output(21, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(16, GPIO.LOW)
                    GPIO.output(21, GPIO.LOW)
                    GPIO.output(13, GPIO.HIGH)
                    GPIO.output(20, GPIO.HIGH)
                    GPIO.output(25, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(13, GPIO.LOW)
                    GPIO.output(20, GPIO.LOW)
                    GPIO.output(25, GPIO.LOW)
                    GPIO.output(12, GPIO.HIGH)
                    GPIO.output(19, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(12, GPIO.LOW)
                    GPIO.output(19, GPIO.LOW)
                    GPIO.output(4, GPIO.HIGH)
                    GPIO.output(6, GPIO.HIGH)
                    GPIO.output(18, GPIO.HIGH)
                    GPIO.output(23, GPIO.HIGH)
                    time.sleep(0.075)
                    GPIO.output(4, GPIO.LOW)
                    GPIO.output(6, GPIO.LOW)
                    GPIO.output(18, GPIO.LOW)
                    GPIO.output(23, GPIO.LOW)

		    # On every button release, all pins go low
            elif event.type == pygame.JOYBUTTONUP:
                print("Button Released")
		        GPIO.output(27, GPIO.LOW)
                GPIO.output(25, GPIO.LOW)
                GPIO.output(23, GPIO.LOW)
		        GPIO.output(22, GPIO.LOW)
                GPIO.output(21, GPIO.LOW)
                GPIO.output(20, GPIO.LOW)
		        GPIO.output(19, GPIO.LOW)
                GPIO.output(18, GPIO.LOW)
                GPIO.output(17, GPIO.LOW)
		        GPIO.output(16, GPIO.LOW)
                GPIO.output(13, GPIO.LOW)
                GPIO.output(12, GPIO.LOW)
		        GPIO.output(6, GPIO.LOW)
                GPIO.output(5, GPIO.LOW)
                GPIO.output(4, GPIO.LOW)

except KeyboardInterrupt:	# Keyboard interrupt will exit program
    print("EXITING NOW")
    j.quit()
	