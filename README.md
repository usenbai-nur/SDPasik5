Smart Home Automation – Decorator & Facade Patterns
Overview

This project demonstrates two important structural design patterns in Java:

Decorator Pattern – dynamically adds new functionality to devices.

Facade Pattern – simplifies interaction with multiple smart devices.

The system simulates a smart home, where devices like lights, music systems, thermostats, and cameras can be controlled directly or through a unified home automation facade.

 Design Patterns Used
1. Decorator Pattern

The Decorator Pattern allows adding new features to existing objects without changing their source code.
Each decorator wraps a Device object and adds behavior such as:

Voice Control

Energy Saving Mode

Remote Access

This shows how the same device gains additional behavior dynamically.

 2. Facade Pattern

The Facade Pattern provides a simplified interface to a complex system of devices.
Instead of managing each device separately, the HomeAutomationFacade coordinates everything through easy-to-use methods.

Example:

HomeAutomationFacade home = new HomeAutomationFacade(light, music, thermostat, camera);
home.startPartyMode();
home.activateNightMode();
home.leaveHome();


Each mode automatically configures all devices — turning lights on/off, setting thermostat modes, starting or stopping recording, etc.

🧱 Project Structure
src/
├── devices/
│   ├── Device.java
│   ├── Light.java
│   ├── MusicSystem.java
│   ├── Thermostat.java
│   └── SecurityCamera.java
├── decorators/
│   ├── DeviceDecorator.java
│   ├── VoiceControlDecorator.java
│   ├── EnergySavingDecorator.java
│   └── RemoteAccessDecorator.java
├── facade/
│   └── HomeAutomationFacade.java
└── Main.java

🧠 Class Responsibilities
Package	Class	Description
devices	Device	Interface for all smart devices
	Light, MusicSystem, Thermostat, SecurityCamera	Concrete device implementations
decorators	DeviceDecorator	Base class for all decorators
	VoiceControlDecorator, EnergySavingDecorator, RemoteAccessDecorator	Add new functionality dynamically
facade	HomeAutomationFacade	Simplifies control of all devices (turn on/off modes)
       	Main	Demonstrates both patterns in action
Result:

Decorator patterns:

Light is ON

Device: Light + Energy Saving + Voice Control
Voice control - working
Energy Saving - working
Light is OFF

Device: Music System + Energy Saving + Remote Access
Remote Access - working
Energy Saving - working
Music is playing

Facade pattern:


Party mode
Light turned ON
Light dimmed
Music started playing
Volume: 80

Night mode
Light turned OFF
Thermostat: eco mode 
Camera started recording
Motion detection enabled

Leave home
Light turned OFF
Music stopped
Thermostat: eco mode 
Camera started recording

Process finished with exit code 0


Decorator Pattern → Flexible way to add behavior at runtime.

Facade Pattern → Simplifies the interface to a group of subsystems.

The combination makes the system modular, easy to extend, and realistic for smart home automation.
