package task2;


public class App {
	public static Game[] games = new Game[10];

	public static void main(String[] args) {
		// 添加3个项目、5个用户、10场比赛数据
		Project[] projects = new Project[3];
		Project proj = new Project();
		proj.name = "A";
		proj.desc = "大家需要依次装好以下环境";
		projects[0] = proj;
		proj = new Project();
		proj.name = "B";
		proj.desc = "找出关键类及其属性，行为";
		projects[1] = proj;
		proj = new Project();
		proj.name = "C";
		proj.desc = "找出关键类及其属性，行为";
		projects[2] = proj;
		
		// 写入用户
		User[] users = new User[5];
		User user = new User();
		user.name = "超级管理员1";
		user.rank = "A";
		users[0] = user;
		user = new User();
		user.name = "超级管理员2";
		user.rank = "A";
		users[1] = user;
		user = new User();
		user.name = "超级管理员3";
		user.rank = "A";
		users[2] = user;
		user = new User();
		user.name = "超级管理员4";
		user.rank = "A";
		users[3] = user;
		user = new User();
		user.name = "超级管理员5";
		user.rank = "A";
		users[4] = user;
		// 写入Game
		Game game = new Game();
		game.project = projects[0];
		game.user = users[3];
		game.point = 1600;
		games[0] = game;
		game = new Game();
		game.project = projects[0];
		game.user = users[2];
		game.point = 1200;
		games[1] = game;
		game = new Game();
		game.project = projects[0];
		game.user = users[4];
		game.point = 100;
		games[2] = game;
		game = new Game();
		game.project = projects[0];
		game.user = users[0];
		game.point = 1600;
		games[3] = game;
		game = new Game();
		game.project = projects[2];
		game.user = users[3];
		game.point = 1600;
		games[4] = game;
		game = new Game();
		game.project = projects[1];
		game.user = users[4];
		game.point = 1600;
		games[5] = game;
		game = new Game();
		game.project = projects[1];
		game.user = users[3];
		game.point = 1600;
		games[6] = game;
		game = new Game();
		game.project = projects[0];
		game.user = users[1];
		game.point = 1600;
		games[7] = game;
		game = new Game();
		game.project = projects[1];
		game.user = users[0];
		game.point = 1600;
		games[8] = game;
		game = new Game();
		game.project = projects[2];
		game.user = users[0];
		game.point = 1600;
		games[9] = game;
		
		
	for (int j = 0; j < users.length; j++) {
		for (int x = 0; x < games.length; x++) {
			// method overloading
			
			if (games[x].user == users[j]) {
				users[j].point += games[x].point ;
			}
		}
	}
	
	// 显示某用户所在的rank
		String[] array1 = {"入门","青铜","白银","黄金","白金","钻石","大师","王者"};
		for (int x = 0; x < users.length; x++) {
			if(users[x].point/300<=8) {
			    users[x].rank = array1[users[x].point/300-1];
			   }else {
			    users[x].rank = array1[7];
			   }



		}
	// 统计第三个用户的平均分
		int a = 0;
		for (int x = 0; x < games.length; x++) {
			// method overloading
			
			if (games[x].user == users[2]) {
				a+= 1 ;
			}
		}

		int a3 = 0;
		if (a!= 0) {
			a3 = users[2].point/a;
		}else {
			a3 = 0;
		}

		//统计A项目有哪些用户未参加
		int[] arraydd = {0,0,0,0,0};
		for (int x = 0; x < games.length; x++) {
			// method overloading
			
			if (games[x].project == projects[0]) {
				for (int j = 0; j < users.length; j++) {
					if (games[x].user == users[j]) {
						arraydd[j] += 1;
					}
				}
				
			}
		}
		
		for (int j = 0; j < arraydd.length; j++) {
		      if(arraydd[j] == 0 ) {
		       System.out.println(users[j].name);
		      }
		     }
		//输出用户天梯表（由高到低显示）
		String[] array = {"超级管理员1","超级管理员2","超级管理员3","超级管理员4","超级管理员5"};
		int array4[] = {0,0,0,0,0};
		for (int x = 0; x < array4.length; x++) {
			array4[x] = users[x].point;
		}
		int dd = 0;
		String cc = "A";
		for (int x = 0; x < array4.length; x++) {
		     for (int j = x; j < array4.length; j++) {
				if(array4[x]<array4[j]) {
					dd = array4[j];
					array4[j] = array4[x];
					array4[x] =dd;
					cc = array[j];
					array[j] = array[x];
					array[x] =cc;
				}
			}
	    }
		for (int x = 0; x < array4.length; x++) {
			
			System.out.println(array4[x]);
		}
		
        for (int x = 0; x < array.length; x++) {
			
			System.out.println(array[x]);
		}
			
        
      //统计全部用户的平均分（平均每场比赛得多少分）
    	int array2[] = {0,0,0,0,0};
    	for (int j = 0; j < users.length; j++) {
    		for (int x = 0; x < games.length; x++) {
    			// method overloading
    			
    			if (games[x].user == users[j]) {
    				array2[j]+= 1 ;
    			}
    		}
    	}
    	float array3[] = {0,0,0,0,0};
    	for (int x = 0; x < array2.length; x++) {
    		if (array2[x] != 0) {
    			array3[x] = users[x].point/array2[x];
    		}else {
    			array3[x] = 0;
    		}
    		
        }
			
		
    	 for (int x = 0; x < array3.length; x++) {
 			
 			System.out.println(array3[x]);
 		}

		
		
}
}
