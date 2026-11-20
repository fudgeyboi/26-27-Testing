package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        // Initialization
        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "FL");
        DcMotor frontRight = hardwareMap.get(DcMotor.class, "FR");
        DcMotor rearLeft = hardwareMap.get(DcMotor.class, "RL");
        DcMotor rearRight = hardwareMap.get(DcMotor.class, "RR");

        // Init limbo
        waitForStart();

        // Main loop
        while (!isStopRequested() && opModeIsActive()) {

            // Poll gamepads
            double back = 0, front = 0, left = 0, right = 0;

            if (gamepad1.dpad_down) {
                back = 1;
            }
            if (gamepad1.dpad_up) {
                front = 1;
            }
            if (gamepad1.dpad_left) {
                left = 1;
            }
            if (gamepad1.dpad_right) {
                right = 1;
            }

            // Calculate movement
            double rotate = right - left;
            double translate = front - back;
            double reducer = Math.max(Math.abs(rotate) + Math.abs(translate), 1);

            // Set motor powers
            frontLeft.setPower((translate - rotate) / reducer);
            frontRight.setPower((translate + rotate) / reducer);
            rearLeft.setPower((translate - rotate) / reducer);
            rearRight.setPower((translate + rotate) / reducer);
        }
    }
}
