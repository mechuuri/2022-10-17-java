/*
 * 	1. 페이지를 10개씩 나눠서 출력
 * 	2. 검색해서 출력
 */
import java.util.Scanner;
public class 문자열배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] guest={"외국인 관광 도시 민박업헤이스 하우스2","외국인 관광 도시 민박업큐브 게스트하우스","한옥체험업토다기","외국인 관광 도시 민박업아리하우스","한옥체험업소소하우스","한옥체험업소담스테이","외국인 관광 도시 민박업드림하우스2","외국인 관광 도시 민박업돌마","한옥체험업연우하우스","외국인 관광 도시 민박업샤샤하우스","외국인 관광 도시 민박업게스트하우스 미야","외국인 관광 도시 민박업다산하우스","외국인 관광 도시 민박업하우스 홍시","외국인 관광 도시 민박업Jeong's family","한옥체험업힐링한옥 채효당","외국인 관광 도시 민박업지유","외국인 관광 도시 민박업홍대스타일 게스트하우스","한옥체험업북촌마루 한옥 게스트하우스","외국인 관광 도시 민박업써울스테이","외국인 관광 도시 민박업Janet's House","한옥체험업연당(緣堂)","한옥체험업바닐라 3 스위트","한옥체험업스페이스 모다","외국인 관광 도시 민박업화웬하우스(huayuan house1)","외국인 관광 도시 민박업Greenery House(그리너리 하우스)","한옥체험업담소정","한옥체험업비빔밥게스트하우스","한옥체험업청향재","외국인 관광 도시 민박업웨이브하우스","외국인 관광 도시 민박업메종 드 웨이브.1","외국인 관광 도시 민박업메종 드 웨이브.2","한옥체험업하노크 북촌","외국인 관광 도시 민박업메종 드 웨이브.3","한옥체험업무위(無爲)","한옥체험업심산재","한옥체험업한옥 201(Hanok 201)","한옥체험업미담","한옥체험업홍유가인","한옥체험업복합한옥공간 곳","한옥체험업덕선재","한옥체험업서울삼촌","한옥체험업민규당 바이 버틀러:리","외국인 관광 도시 민박업버틀러:리","외국인 관광 도시 민박업지월장(指月藏)","외국인 관광 도시 민박업게스트하우스 더힐2","외국인 관광 도시 민박업예하도예 게스트하우스(YEHADOYE guesthouse)","외국인 관광 도시 민박업알(R)게스트하우스_2(알게호)","한옥체험업에밀(Emile)","한옥체험업연당(緣堂)","한옥체험업바닐라 3 스위트","한옥체험업스페이스 모다","외국인 관광 도시 민박업화웬하우스(huayuan house1)","외국인 관광 도시 민박업Greenery House(그리너리 하우스)","외국인 관광 도시 민박업서울 낙산 스테이(Seoul Naksan stay)","외국인 관광 도시 민박업쯔요시노이에(tuyosinoie)","외국인 관광 도시 민박업경복궁 서촌 크리스천 홈(Christian Home)","외국인 관광 도시 민박업스페이스 휴(Space Hue)","외국인 관광 도시 민박업USB하우스","외국인 관광 도시 민박업어반 엑시트(URBAN EXIT)","한옥체험업종로한옥 궁 게스트하우스","한옥체험업만희재","한옥체험업시은재","한옥체험업은화당","외국인 관광 도시 민박업CASA CIELO","외국인 관광 도시 민박업LikeU","외국인 관광 도시 민박업필프리 하우스","외국인 관광 도시 민박업Jenny House","외국인 관광 도시 민박업준 하우스","외국인 관광 도시 민박업파크애비뉴2","외국인 관광 도시 민박업27번가 게스트하우스","한옥체험업한옥스테이 언니집","외국인 관광 도시 민박업퀸 하우스","외국인 관광 도시 민박업LOFT 43 AMAZING HOUSE","외국인 관광 도시 민박업에이프릴문 하우스","외국인 관광 도시 민박업모던금자","외국인 관광 도시 민박업엘하우스(L House)","한옥체험업한옥 포지티브스","한옥체험업풍경","한옥체험업소우주","한옥체험업석이한옥","한옥체험업서울이야기 한옥","한옥체험업다온 게스트하우스","외국인 관광 도시 민박업한소","외국인 관광 도시 민박업오케이 게스트하우스","외국인 관광 도시 민박업지미집1","외국인 관광 도시 민박업홈브릭(Brick House B)","한옥체험업한미장","외국인 관광 도시 민박업웰컴게스트하우스","한옥체험업오-늘 스테이","외국인 관광 도시 민박업Joy house","한옥체험업다자연 한옥게스트하우스","외국인 관광 도시 민박업오 마이 게스트하우스","외국인 관광 도시 민박업마루지 게스트하우스","외국인 관광 도시 민박업Brick House","외국인 관광 도시 민박업삼청동 코리아 게스트하우스","한옥체험업Hi, 동대문 한옥게스트하우스","외국인 관광 도시 민박업알하우스","외국인 관광 도시 민박업만두 게스트하우스","외국인 관광 도시 민박업앨리스","외국인 관광 도시 민박업어반우드","외국인 관광 도시 민박업헤이스 하우스2","외국인 관광 도시 민박업헤이스 하우스1","외국인 관광 도시 민박업원 하우스","외국인 관광 도시 민박업River Side","한옥체험업락고재","외국인 관광 도시 민박업둥글하우스","외국인 관광 도시 민박업그린홈스테이","외국인 관광 도시 민박업더서울하우스","외국인 관광 도시 민박업알 게스트하우스","외국인 관광 도시 민박업큐브 게스트하우스","한옥체험업토다기","외국인 관광 도시 민박업아리하우스","한옥체험업소소하우스","외국인 관광 도시 민박업타임트래블러 릴렉스","외국인 관광 도시 민박업코지룸","외국인 관광 도시 민박업캄앤제이(Calm&Jay)","외국인 관광 도시 민박업양재블루","외국인 관광 도시 민박업롱램","외국인 관광 도시 민박업Photo Park(포토박)","외국인 관광 도시 민박업빅 존스 플레이스","외국인 관광 도시 민박업데스파시토","외국인 관광 도시 민박업종로하루","외국인 관광 도시 민박업아름다운 황토집","외국인 관광 도시 민박업리재","외국인 관광 도시 민박업도토리집","외국인 관광 도시 민박업와이이공이(Y202)","외국인 관광 도시 민박업시월","한옥체험업(주)이리루","외국인 관광 도시 민박업피스비(PIS-B)","한옥체험업락고재 북촌빈관","외국인 관광 도시 민박업스위트룸","외국인 관광 도시 민박업동주르 하우스","한옥체험업인우하우스","한옥체험업학민재","외국인 관광 도시 민박업몽키하우스","외국인 관광 도시 민박업스테이. 노멀띵스","외국인 관광 도시 민박업코리게스트하우스","한옥체험업통인 1939","외국인 관광 도시 민박업게스트하우스 몽자","외국인 관광 도시 민박업개운산집","외국인 관광 도시 민박업다다홈","한옥체험업서형가","외국인 관광 도시 민박업라온 하우스 연남","한옥체험업공심가","외국인 관광 도시 민박업이브","외국인 관광 도시 민박업아늑공간","외국인 관광 도시 민박업맨션 케렌시아","외국인 관광 도시 민박업베르디게스트하우스(VERDI GUESTHOUSE)","외국인 관광 도시 민박업몬데이크래커 홍대","외국인 관광 도시 민박업홍대 애비뉴","외국인 관광 도시 민박업지미집2","외국인 관광 도시 민박업24게스트하우스 경희대점","외국인 관광 도시 민박업서울 성북 홈스테이","외국인 관광 도시 민박업라온 하우스 홍대","외국인 관광 도시 민박업엠마 게스트하우스","외국인 관광 도시 민박업121북촌","외국인 관광 도시 민박업쥘리앵","외국인 관광 도시 민박업미로 게스트하우스","외국인 관광 도시 민박업세신버팔로","한옥체험업가회한옥체험관","한옥체험업지금(ZIKM)","한옥체험업민규당 바이 버틀러:리","외국인 관광 도시 민박업버틀러:리","외국인 관광 도시 민박업지월장(指月藏)","외국인 관광 도시 민박업게스트하우스 더힐2","외국인 관광 도시 민박업예하도예 게스트하우스(YEHADOYE guesthouse)","외국인 관광 도시 민박업알(R)게스트하우스_2(알게호)","한옥체험업에밀(Emile)","한옥체험업소담스테이","외국인 관광 도시 민박업드림하우스2","외국인 관광 도시 민박업돌마","한옥체험업연우하우스","외국인 관광 도시 민박업샤샤하우스","외국인 관광 도시 민박업게스트하우스 미야","외국인 관광 도시 민박업다산하우스","외국인 관광 도시 민박업하우스 홍시","외국인 관광 도시 민박업Jeong's family","한옥체험업힐링한옥 채효당","외국인 관광 도시 민박업지유","외국인 관광 도시 민박업홍대스타일 게스트하우스","한옥체험업북촌마루 한옥 게스트하우스","외국인 관광 도시 민박업써울스테이","외국인 관광 도시 민박업Janet's House","외국인 관광 도시 민박업깨끗하고 아늑한 집(Clean Cosy House)","한옥체험업정연재","한옥체험업응정헌","한옥체험업누하당","한옥체험업효자스테이","외국인 관광 도시 민박업쿤하우스(Koon house)","외국인 관광 도시 민박업예본의 집","외국인 관광 도시 민박업아트하우스","한옥체험업서촌게스트하우스","외국인 관광 도시 민박업더 어반 게스트하우스","외국인 관광 도시 민박업하우스앤가든(House & Gaden)","외국인 관광 도시 민박업린다픽","한옥체험업코지한옥","한옥체험업루민 북촌","외국인 관광 도시 민박업Aron house","외국인 관광 도시 민박업Y's house","외국인 관광 도시 민박업Brick House","외국인 관광 도시 민박업삼청동 코리아 게스트하우스","한옥체험업Hi, 동대문 한옥게스트하우스","외국인 관광 도시 민박업알하우스","외국인 관광 도시 민박업만두 게스트하우스","외국인 관광 도시 민박업앨리스","외국인 관광 도시 민박업어반우드"};
	Scanner scan=new Scanner(System.in);	
	int curpage=1;
	int totalpage=(int)(Math.ceil(guest.length/10.0));
	
	System.out.print("페이지 입력(1~"+totalpage+"):");
	curpage=scan.nextInt();
	System.out.println(curpage+" page / "+totalpage+" pages");
	System.out.println("===== "+curpage+" page =====");
	System.out.println();
	
	int j=0;
	int rowSize=20;
	int pagecnt=(curpage*rowSize)-rowSize;
	
	for(int i=0;i<guest.length;i++)
	{
		if(j<rowSize && i>=pagecnt)
		{
			System.out.println((i+1)+"."+guest[i]);
			j++;
		}
	}
	System.out.println("=========================");
	System.out.print("검색어 입력:");
	String fd=scan.next();
	
	for(int i=0;i<guest.length;i++)
	{
		if(guest[i].contains(fd))
		{
			System.out.println(guest[i]);
		}
	}
			
			
	
	/*
	 * int curpage=1; 현재 페이지 설정
	 * int totalpage=(int)(Math.ceil(guest.length/10.0)); 총페이지 구하기
	 * 
	 * System.out.println(curpage+" page / "+totalpage+" pages");
	 * Scanner scan=new Scanner(System.in);
	 * System.out.print("1~"+totalpage+" 페이지 입력:");
	 * curpage=scan.nextInt();
	 * System.out.println("====="+curpage+" page 내용 ====="); 
	 * 
	 * 페이지 나누기
	 * int j=0; // 10개씩 나눠주는 변수  j<10
	 * int pagecnt=(curpage*10)-10; 1page => 0, 2page => 10(시작위치), 3page => 20 ==> 배열의 인덱스 시작 번호(출력) ==> 앞은 스킵
	 * 
	 * for(int i=0;i<guest.length;i++)
	 * {
	 * 		if(j<10 && i>=pagecnt)
	 * 		{
	 * 			System.out.println((i+1)+"."+guest[i]);
	 * 			j++;
	 * 		}
	 * }
	 * 	
	 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
