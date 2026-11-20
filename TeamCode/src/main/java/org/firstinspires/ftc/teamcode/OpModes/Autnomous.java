package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Autnomous {
    public class Autonomous extends LinearOpMode {
        DcMotor motorleft;
        DcMotor motorright;
        DcMotor frontleft;
        DcMotor frontright;

        @Override
        public void runOpMode(){
            motorleft = hardwareMap.get(DcMotor.class, "RL");
            motorright = hardwareMap.get(DcMotor.class, "RR");
            frontleft = hardwareMap.get(DcMotor.class, "FL");
            frontright = hardwareMap.get(DcMotor.class, "FR");

            // initialization
            waitForStart();
            // Run

        }
    }
}
