package ru.skyeng;

public class Main {

    public static void main(String[] args) {
        //write your code here
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг ");
        var diferenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между массами бойцов " + diferenceWeight + " кг ");
        var overLoad = boxerWeight2 % boxerWeight1;
        System.out.println("Разница масс спортсменов " + overLoad + " кг");
        var totalHours = 640;
        System.out.println(totalHours);
        var oneEmployee = 8;
        System.out.println(oneEmployee);
        var totalPeople = totalHours / oneEmployee;
        System.out.println("Всего работников в компании " + " - " + totalPeople + " человек");
        var morePeople = totalPeople + 94;
        System.out.println(morePeople);
        var moreHours = morePeople * oneEmployee;
        System.out.println(moreHours);
        System.out.println("Если в компании работает " + morePeople + " человек, то всего " + moreHours + " часов работы может быть поделено между сотрудниками");



    }
}