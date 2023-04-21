package Help_from_Ilya;

public class ServiceStation {
    public void check (Maintainable maintainable){ //полиморфия и здесь же перегрузка метода check() в 'check(object)',
        // агрегатирование сверху вниз: Maintainable-Vehicle-все три подкласса и классы-вызывальщики Main и ServiseStation
        maintainable.check(); //вызов переписанного метода в одном из 3-х подклассов
        System.out.println();
    }
}
