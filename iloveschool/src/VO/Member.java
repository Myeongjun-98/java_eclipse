package VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	private 	long id;
	private 	String memberId;
	private 	String email;
	private 	String password;
	private 	String birth;
}
