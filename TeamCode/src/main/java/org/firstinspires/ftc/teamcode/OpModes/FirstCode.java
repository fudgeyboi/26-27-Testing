
package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
@Autonomous
public class FirstCode extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor frontLeft;
    DcMotor frontRight;

    @Override
    public void runOpMode() {
        motorLeft = hardwareMap.get(DcMotor.class, "RL");
        motorRight = hardwareMap.get(DcMotor.class, "RR");
        frontLeft = hardwareMap.get(DcMotor.class, "FL");
        frontRight = hardwareMap.get(DcMotor.class, "FR");

        // initialization
        waitForStart();
        // run stuff
        motorLeft.setPower(1);
        motorRight.setPower(1);
        sleep(1000);
        motorLeft.setPower(0);
        motorRight.setPower(0);
    }

}
