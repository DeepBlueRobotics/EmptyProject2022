// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.carlmontrobotics.lib199.MotorErrors.TemperatureLimit;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class OI {
        public static enum ControlType {JOYSTICKS, GAMEPAD};
        public static enum StickType {LEFT, RIGHT};
        public static enum StickDirection {X, Y};

        public static ControlType CONTROL_TYPE = ControlType.JOYSTICKS;

        public static final class LeftJoy {
            public static final int port = 0;
            public static final int toggleDriveMode = 0;
            public static final int toggleArcade = 0;
            public static final String toggleTank = null;
        }
        
        public static final class RightJoy {
            public static final int port = 0;
        }
    }

    public static final class DriveConstants {
        public static final TemperatureLimit motorTempLimit = null;
        public static boolean tank = true;
    }

    public static final class DrivePorts {
        public static final int lSparkMax = 1;
        public static final int rSparkMax = 0;
    }
}