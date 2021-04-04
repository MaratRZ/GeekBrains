package com.company.homework_02_01;

import com.company.homework_02_01.obstacle.RunningTrack;
import com.company.homework_02_01.obstacle.Wall;
import com.company.homework_02_01.participant.Cat;
import com.company.homework_02_01.participant.Human;
import com.company.homework_02_01.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(3, 5);
        Human human = new Human(1, 3);
        Robot robot = new Robot(0, 10);
        Object[] participants = {cat, human, robot};

        RunningTrack runningTrack1 = new RunningTrack(4);
        RunningTrack runningTrack2 = new RunningTrack(2);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Object[] obstacles = {runningTrack1, wall1, runningTrack2, wall2};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall) {
                    jump(participants[i], (Wall) obstacles[j]);
                } else if (obstacles[j] instanceof RunningTrack) {
                    run(participants[i], (RunningTrack) obstacles[j]);
                }
            }
        }
    }

    private static void jump(Object object, Wall wall) {
        boolean jumpSuccess = false;

        if (object instanceof Cat) {
            jumpSuccess = ((Cat) object).jump(wall.getHeight());
        } else if (object instanceof Human) {
            jumpSuccess = ((Human) object).jump(wall.getHeight());
        } else if (object instanceof Robot) {
            jumpSuccess = ((Robot) object).jump(wall.getHeight());
        }

        if (jumpSuccess) {
            System.out.println(object.toString() + " преодолел стену высотой " + wall.getHeight());
        } else {
            System.out.println(object.toString() + " не смог преодолеть стену высотой " + wall.getHeight());
        }
    }

    private static void run(Object object, RunningTrack runningTrack) {
        boolean runSuccess = false;

        if (object instanceof Cat) {
            runSuccess = ((Cat) object).run(runningTrack.getDistance());
        } else if (object instanceof Human) {
            runSuccess = ((Human) object).run(runningTrack.getDistance());
        } else if (object instanceof Robot) {
            runSuccess = ((Robot) object).run(runningTrack.getDistance());
        }

        if (runSuccess) {
            System.out.println(object.toString() + " преодолел дистанцию длиной " + runningTrack.getDistance());
        } else {
            System.out.println(object.toString() + " не смог преодолеть дистанцию длиной " + runningTrack.getDistance());
        }
    }
}
