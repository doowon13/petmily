/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-01 07:37:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.department;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import department.model.vo.Department;
import com.google.gson.Gson;
import member.model.vo.Member;

public final class deptsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/department/../common/main.jsp", Long.valueOf(1693553799811L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("department.model.vo.Department");
    _jspx_imports_classes.add("com.google.gson.Gson");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

ArrayList<Department> list = (ArrayList<Department>) request.getAttribute("list");
String searchInfo = (String) request.getAttribute("search");
String type = (String)request.getAttribute("type");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Petmily</title>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("	src=\"/petmily/resources/js/main/banner_scroll.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("@media ( min-width : 1050px) {\n");
      out.write("	.block {\n");
      out.write("		width: 1050px;\n");
      out.write("		margin: 98px auto 0 auto;\n");
      out.write("		word-wrap: break-word;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write("html, body {\n");
      out.write("	height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#main {\n");
      out.write("	width: 100%;\n");
      out.write("	height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#top {\n");
      out.write("	width: 100%;\n");
      out.write("	height: 150px;\n");
      out.write("	margin-bottm: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#bottom {\n");
      out.write("	width: 100%;\n");
      out.write("	height: 80%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#map {\n");
      out.write("	width: 70%;\n");
      out.write("	height: 100%;\n");
      out.write("	float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#info {\n");
      out.write("	width: 30%;\n");
      out.write("	height: 100%;\n");
      out.write("	float: right;\n");
      out.write("	overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".markerDeptName {\n");
      out.write("	display: block;\n");
      out.write("	text-align: center;\n");
      out.write("	width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1#searchvalue {\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write("img#searchImg {\n");
      out.write("	width: 200px;\n");
      out.write("	height: 80px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	");
      out.write('\n');
 Member member = (Member)session.getAttribute("member"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Petmily</title>\n");
      out.write("<script type=\"text/javascript\" src=\"/petmily/resources/js/main/main.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/petmily/resources/css/main/main.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<input type=\"checkbox\" id=\"menuicon\">\n");
      out.write("\n");
      out.write("	<header style=\"left: 0px;\">\n");
      out.write("		<div>\n");
      out.write("			<ul class=\"navi\">\n");
      out.write("				<!-- style=\"top: 50px; right: 77px;\" -->\n");
      out.write("				<li class=\"logo\"><a href=\"/petmily/index.jsp\">Petmily</a></li>\n");
      out.write("				<li>\n");
      out.write("               <form action=\"/petmily/selectdepartment\" method=\"get\" class='formSearch' style=\"margin-right: 80px;\">\n");
      out.write("                  <div class='field'>\n");
      out.write("                     <input class='inputSearch' id='inputSearch' name='inputSearch'\n");
      out.write("                        required type='text'><label for='inputSearch'>\n");
      out.write("                        지역, 이름으로 검색 </label>\n");
      out.write("                  </div>\n");
      out.write("               </form>\n");
      out.write("				</li>\n");
      out.write("\n");
      out.write("				<li><a class=\"sub-link\" href=\"/petmily/selectdepttype?selecttype=9&typename=내주변\">내주변</a></li>\n");
      out.write("				<li><a class=\"sub-link\" href=\"/petmily/splist\" method=\"get\">커뮤니티</a></li>\n");
      out.write("\n");
      out.write("				");
if(member == null){ 
      out.write("\n");
      out.write("				<li><a class=\"sub-link\" href=\"/petmily/views/member/login.jsp\">로그인</a></li>\n");
      out.write("				");
 }else{ 
      out.write("\n");
      out.write("				\n");
      out.write("				<li\n");
      out.write("					style=\"display: inline-block; font-size: 15px; width: 90px; height: 20px; position: absolute; top: 25px; margin-left: 20px;\">");
      out.print( member.getMemberNick() );
      out.write("님</li>\n");
      out.write("				<li\n");
      out.write("					style=\"display: inline-block; font-size: 15px; width: 90px; height: 20px;\"><a\n");
      out.write("					href=\"/petmily/logout\"\n");
      out.write("					style=\"padding-top: 0px; padding-left: 0px; padding-right: 0px; padding-bottom: 0px; margin-left: 45px; position: relative; top: 12px;\">logout</a></li>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("			</ul>\n");
      out.write("			<label for=\"menuicon\" class=\"menubtn\"> <span></span> <span></span>\n");
      out.write("				<span></span>\n");
      out.write("			</label>\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("	<div class=\"menu-container\">\n");
      out.write("		<div class=\"sidebar\">\n");
      out.write("			<span class=\"area_desc\" style=\"margin-top: 25%\">\n");
      out.write("				<ul>\n");
      out.write("					");
 if(member == null) { 
      out.write("\n");
      out.write("					<li class=\"sidebarmenutitle\">더보기</li>\n");
      out.write("					\n");
      out.write("					<li><a href=\"/petmily/suggest\" class=\"sidebarmenu\">고객센터</a></li>\n");
      out.write("					");
 }else if(member.getMemberGrade().equals("1")){ 
      out.write("\n");
      out.write("					<li class=\"sidebarmenutitle\">더보기</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("					<li><a href=\"/petmily/mypet?memberSeq=");
      out.print( member.getMemberSeq() );
      out.write("\" class=\"sidebarmenu\">마이페이지</a></li>\n");
      out.write("\n");
      out.write("					<li><a href=\"/petmily/suggest\" class=\"sidebarmenu\">고객센터</a></li>\n");
      out.write("\n");
      out.write("					");
 }else if(member.getMemberGrade().equals("0")){ 
      out.write("\n");
      out.write("					<li class=\"sidebarmenutitle\">더보기</li>\n");
      out.write("					<li><a href=\"#\" class=\"sidebarmenu\">마이페이지</a></li>\n");
      out.write("					<li><a href=\"/petmily/adminmain\" class=\"sidebarmenu\">업체등록</a></li>\n");
      out.write("					<li><a href=\"/petmily/srtd\" class=\"sidebarmenu\">업체삭제</a></li>\n");
      out.write("					<li><a href=\"/petmily/memli\" class=\"sidebarmenu\">회원등급변경</a></li>\n");
      out.write("					<li><a href=\"#\" class=\"sidebarmenu\">일반게시판관리</a></li>\n");
      out.write("					<li><a href=\"#\" class=\"sidebarmenu\">거래게시판관리</a></li>\n");
      out.write("					<li><a href=\"/petmily/suggestAdmin?mseq=");
      out.print(member.getMemberSeq());
      out.write(", mGrade=");
      out.print(member.getMemberGrade());
      out.write("\" class=\"sidebarmenu\">관리자 고객센터</a></li>\n");
      out.write("					");
 }else if(member.getMemberGrade().equals("2")){ 
      out.write("\n");
      out.write("					\n");
      out.write("					");
 } 
      out.write("\n");
      out.write("				</ul>\n");
      out.write("			</span><br>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	</header>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("	<div id=\"main\" class=\"block\">\n");
      out.write("		<div id=\"top\">\n");
      out.write("			<h1 id=\"searchvalue\">\n");
      out.write("				검색 정보 :\n");
      out.write("				");
      out.print(searchInfo);
      out.write("</h1>\n");
      out.write("\n");
      out.write("			<script type=\"text/javascript\">\n");
      out.write("				var lat = 0;\n");
      out.write("				var lng = 0;\n");
      out.write("				//실행시 권한 요청을 수락하여야 함.\n");
      out.write("				navigator.geolocation.getCurrentPosition(function(position) {\n");
      out.write("					lat = position.coords.latitude;\n");
      out.write("					lng = position.coords.longitude;\n");
      out.write("\n");
      out.write("				});\n");
      out.write("			</script>\n");
      out.write("			<hr>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"bottom\">\n");
      out.write("			<div id=\"map\">\n");
      out.write("				<script type=\"text/javascript\"\n");
      out.write("					src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=47b2dcffee9e1b18c1d5105786e522b7\"></script>\n");
      out.write("				<script>\n");
      out.write("					var dept =\n");
      out.write("				");
      out.print(new Gson().toJson(list));
      out.write(";\n");
      out.write("					console.log(dept);\n");
      out.write("\n");
      out.write("					if (\n");
      out.write("				");
      out.print(list.size());
      out.write("\n");
      out.write("					> 0) {\n");
      out.write("						lat = dept[0].deptLatitude;\n");
      out.write("						lng = dept[0].deptLongitude;\n");
      out.write("					}  \n");
      out.write("\n");
      out.write("					var container = document.getElementById('map');\n");
      out.write("					var options = {\n");
      out.write("						center : new kakao.maps.LatLng(lat, lng),\n");
      out.write("						level : 3\n");
      out.write("					};\n");
      out.write("\n");
      out.write("					var imageSrc = null;\n");
      out.write("\n");
      out.write("					var map = new kakao.maps.Map(container, options);\n");
      out.write("					var infowindow = null; // infowindow 변수 미리 선언\n");
      out.write("				\n");
      out.write("					//위치정보 동의가 있으면	 \n");
      out.write("					//0이 select name\n");
      out.write("					if(");
      out.print( type );
      out.write(" == \"0\") {\n");
      out.write("						if (navigator.geolocation) {\n");
      out.write("							navigator.geolocation\n");
      out.write("									.getCurrentPosition(function(position) {\n");
      out.write("										var userLat = position.coords.latitude;\n");
      out.write("										var userLng = position.coords.longitude;\n");
      out.write("\n");
      out.write("										var userMarker = new kakao.maps.Marker(\n");
      out.write("												{\n");
      out.write("													map : map,\n");
      out.write("													position : new kakao.maps.LatLng(\n");
      out.write("															userLat, userLng),\n");
      out.write("													title : '현재 위치',\n");
      out.write("													image : new kakao.maps.MarkerImage(\n");
      out.write("															\"/petmily/resources/images/marker/myloc.png\",\n");
      out.write("															new kakao.maps.Size(34,\n");
      out.write("																	45))\n");
      out.write("												});\n");
      out.write("\n");
      out.write("										// 내 위치를 중심으로 지도 표시\n");
      out.write("										map.setCenter(new kakao.maps.LatLng(\n");
      out.write("												userLat, userLng));\n");
      out.write("									});\n");
      out.write("						} else {\n");
      out.write("							alert(\"내 위치 정보를 가져올 수 없습니다\");\n");
      out.write("						}\n");
      out.write("					}\n");
      out.write("	\n");
      out.write("					var infowindow = new kakao.maps.InfoWindow(); // 인포윈도우 객체 생성\n");
      out.write("\n");
      out.write("					for (var i = 0; i < dept.length; i++) {\n");
      out.write("						var type = dept[i].deptType;\n");
      out.write("						if (type == 1) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/hospital.png\";\n");
      out.write("						} else if (type == 2) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/miyong.png\";\n");
      out.write("						} else if (type == 3) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/yongpom.png\";\n");
      out.write("						} else if (type == 4) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/wetak.png\";\n");
      out.write("						} else if (type == 5) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/die.png\";\n");
      out.write("						} else if (type == 6) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/food.png\";\n");
      out.write("						} else if (type == 7) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/hotel.png\";\n");
      out.write("						} else if (type == 8) {\n");
      out.write("							imageSrc = \"/petmily/resources/images/marker/culture.png\";\n");
      out.write("						}\n");
      out.write("\n");
      out.write("						var imageSize = new kakao.maps.Size(34, 45);\n");
      out.write("\n");
      out.write("						// 마커 이미지를 생성합니다    \n");
      out.write("						var markerImage = new kakao.maps.MarkerImage(imageSrc,\n");
      out.write("								imageSize);\n");
      out.write("\n");
      out.write("						var marker = new kakao.maps.Marker(\n");
      out.write("								{\n");
      out.write("									map : map,\n");
      out.write("									position : new kakao.maps.LatLng(\n");
      out.write("											dept[i].deptLatitude,\n");
      out.write("											dept[i].deptLongitude),\n");
      out.write("									title : dept[i].deptName,\n");
      out.write("									image : markerImage\n");
      out.write("								});\n");
      out.write("\n");
      out.write("						var deptSeq = dept[i].deptSeq;\n");
      out.write("						\n");
      out.write("						// 클로저를 이용하여 인포윈도우에 표시할 정보를 제공\n");
      out.write("						(function(marker, deptName, deptSeq) {\n");
      out.write("						    kakao.maps.event.addListener(marker, 'click', function() {\n");
      out.write("						        var content = '<div class=\"markerDeptName\"><a href=\"/petmily/mis?deptSeq=' + deptSeq + '\">' + deptName + '</a></div>';\n");
      out.write("						        infowindow.setContent(content); // 가게 이름 설정\n");
      out.write("						        infowindow.open(map, marker);\n");
      out.write("						    });\n");
      out.write("						})(marker, dept[i].deptName, deptSeq);\n");
      out.write("						marker.setMap(map);\n");
      out.write("					}\n");
      out.write("				</script>\n");
      out.write("			</div>\n");
      out.write("			<div id=\"info\">\n");
      out.write("				<h2>\n");
      out.write("					검색 결과 :\n");
      out.write("					");
      out.print(list.size());
      out.write("\n");
      out.write("					개\n");
      out.write("				</h2>\n");
      out.write("				<hr>\n");
      out.write("				");

				for (Department dept : list) {
				
      out.write("\n");
      out.write("				<div id=\"searchInfo\">\n");
      out.write("					<img id=\"searchImg\"\n");
      out.write("						src=\"/petmily/resources/images/mainbanner/885.jpg\" align=\"left\">\n");
      out.write("					<h3>\n");
      out.write("						<a href=\"/petmily/mis?deptSeq=");
      out.print(dept.getDeptSeq());
      out.write('"');
      out.write('>');
      out.print(dept.getDeptName());
      out.write("</a>\n");
      out.write("					</h3>\n");
      out.write("					<h4>");
      out.print(dept.getDeptAddress());
      out.write("</h4>\n");
      out.write("				</div>\n");
      out.write("				<hr>\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}