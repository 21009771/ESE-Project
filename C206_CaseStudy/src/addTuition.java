
public class addTuition {

		private int code;
		private String title;
		private String groupName;
		private int duration;
		private String preRequisite;
		private String teacher;
		
		public addTuition(int code,String title, String groupName, int duration,String preRequisite, String teacher) {
			this.code = code;
			this.title = title;
			this.groupName = groupName;
			this.duration = duration;
			this.preRequisite = preRequisite;
			this.teacher = teacher;
			
		}
		//toString Jayda :)
		public String toString() {
			
			String tuitionInfo = String.format("%-10d %-30s %-10s %-10d %-10s %-10s", 
					code,
					title, 
					groupName,
					duration,
					preRequisite,
					teacher);
			
			
			return tuitionInfo;
		}

		public int getCode() {
			return code;
		}

		public String getTitle() {
			return title;
		}

		public String getGroupName() {
			return groupName;
		
		}
		public String getPreRequisite() {
			return preRequisite;
		}
		public int getDuration() {
			return duration;
		}
		public String getTeacher() {
			return teacher;
		}

}