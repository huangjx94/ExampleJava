public class Base{
	private		String pri_str = "私有变量";
				String def_str = "默认变量";
	protected	String pro_str = "pro变量";
    public  	String pub_str = "pub变量";

		/* private void pri_show(){
			System.out.println("私有变量");
		} */
				
			void def_show(){
			System.out.println("默认变量");
		}

		protected void pro_show(){
			System.out.println("pro变量");
		}
		
		public void pub_show(){
			System.out.println("pub变量");
		}
}