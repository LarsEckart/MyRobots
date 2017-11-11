package ee.tublipoiss.robots

import robocode.HitByBulletEvent
import robocode.HitWallEvent
import robocode.Robot
import robocode.ScannedRobotEvent
import java.awt.Color


class KotlinBot : Robot() {

    override fun run() {
        setColors(Color.cyan, Color.red, Color.orange)
        while (true) {
            ahead(100.0)
            turnGunRight(360.0)
            back(100.0)
            turnGunRight(360.0)
        }
    }

    override fun onScannedRobot(e: ScannedRobotEvent?) {
        // Replace the next line with any behavior you would like
        fire(1.0)
        fire(1.0)
        fire(1.0)
    }

    override fun onHitByBullet(e: HitByBulletEvent?) {
        // Replace the next line with any behavior you would like
        back(10.0)
    }

    override fun onHitWall(e: HitWallEvent?) {
        // Replace the next line with any behavior you would like
        back(20.0)
    }
}
