package com.enum01;

public enum Season implements TestIntersea {
    SPRING{
        @Override
        public void show() {
            super.show();
        }
    },
    SUMMER,
    AUTEMN,
    WINTER;

    @Override
    public void show() {
        System.out.println("season的重写方法。");
    }
}
