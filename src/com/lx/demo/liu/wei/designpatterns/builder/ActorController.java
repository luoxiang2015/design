//designpatterns.builder.ActorController.java
package com.lx.demo.liu.wei.designpatterns.builder;

public class ActorController {
    //�𲽹������Ӳ�Ʒ����
	public Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor=ab.createActor();
		return actor;
	}
}