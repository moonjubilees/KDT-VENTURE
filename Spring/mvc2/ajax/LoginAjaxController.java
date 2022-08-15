package ajax;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mybatis.MemberDTO;
import spring.mybatis.MemberService;

@Controller
public class LoginAjaxController {
	
	@Autowired
	@Qualifier("mybatisservice")
	MemberService service;
	
	
//�α����� ȭ�� �� �����ִ� �޼ҵ�
	@RequestMapping(value="/ajax/login", method=RequestMethod.GET)
	public void loginform() {//�� ��� 
	}

//�α��� ajax ó�� �޼ҵ�
	@RequestMapping(value="/ajax/login", method=RequestMethod.POST , produces = {"application/json;charset=utf-8"} )
	@ResponseBody
	public String loginresult(String id, String password) {
		if(id.equals("ajax") && password.equals("1234")) {
			return "{\"process\":\"����α���\" , \"role\":\"admin\"}";
		}
		else {
			return "{\"process\":\"������α���\" , \"role\":\"user\"}";
		}
		
	}
	/*url: '<%=request.getContextPath() %>/ajax/myinform',
	data : {'id':$("#id").val(), 'password':$("#password").val() } , 
	type : 'get' ,*/
	@RequestMapping(value="/ajax/myinform" , produces = {"application/json;charset=utf-8"})
	@ResponseBody
	public MemberDTO myinform(String id, String password) {
		// spring.mybatis ��Ű�� service dao dto sql-mapping.xml
		MemberDTO dto = service.member(id);
		System.out.println("/ajax/myinform ȣ��==> "+dto);
		if(dto == null) {
			dto = new MemberDTO();
			dto.setId("new"); //Ŭ���̾�Ʈ id == new 
		}
		else if(!dto.getPassword().equals(password)){
			dto.setPassword("new");
			dto.setEmail(null);
			dto.setName(null);
			dto.setPhone(null);
			dto.setAddress(null);
		}
		return dto;  //3.pom.xml ���̺귯�� <dependency> �ڹٰ�ü�� json ��ȯ �ڵ�
	}
	
	@RequestMapping(value="/ajax/memberlist"  , produces = {"application/json;charset=utf-8"})
	@ResponseBody
	public List<MemberDTO> memberlist(){
		List<MemberDTO> list = service.memberlist();
		
		return list;
		
	}
}











