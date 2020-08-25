package com.company.day32.chap1;

public class MakeShape extends Shape{
    private Shape[] makeShapes;

    public void setMakeShapes(Shape[] makeShapes){
        this.makeShapes = makeShapes;
    }

    Shape[] getMakeShapes(){
        return makeShapes;
    }

    public void insertShape(String shapeName, int ... length){
        Shape[] buffers  = new Shape[makeShapes.length + 1];

        for(int index = 0; index < makeShapes.length; index++){
            buffers[index] = makeShapes[index];
            //System.out.println(buffers[index].getShapeName());
        }

        buffers[makeShapes.length] = new Shape();
        buffers[makeShapes.length].setShapeName(shapeName);
        buffers[makeShapes.length].shapeArea(length);

        makeShapes = buffers;

//        for(int index = 0; index < makeShapes.length; index++){
//            System.out.println(makeShapes[index].getShapeName());
//        }
        //원, 직각삼각형 입력하는 메소드 만들기
        //모든 도형 넓이 둘레 합산
        //도형 넓이 순서 출력
    }

    public void sort(){
        Shape[] tempShapes = makeShapes.clone();

        for(int index = 0; index < tempShapes.length; index++){
            for(int jdex = 0; jdex < tempShapes.length - 1; jdex++){
                if(tempShapes[jdex].getShapeArea() < tempShapes[jdex + 1].getShapeArea()){
                    Shape temp = tempShapes[jdex + 1];
//                    System.out.println("TEMP : " + temp.getShapeName() + "\t DES : " + temp.getShapeName());
                    tempShapes[jdex] = tempShapes[jdex + 1];
                    tempShapes[jdex + 1] = temp;
                }
            }

            System.out.println(makeShapes[0].getShapeName());
            System.out.println(makeShapes[1].getShapeName());
            System.out.println(makeShapes[2].getShapeName());
        }

        setMakeShapes(tempShapes);
        makeShapes = tempShapes;
        System.out.println("----< SORT >----");
        System.out.println(makeShapes[0].getShapeName());
        System.out.println(makeShapes[1].getShapeName());
        System.out.println(makeShapes[2].getShapeName());
        System.out.println("----< SORT >----");

    }
}
