package com.kh.mvc.member.model.dto;

import java.sql.Date;
import java.sql.Timestamp;

/*
 * DTO - Data Transfer Object
 * 
 * */
public class Member {
	
	private String memberId;
	private String password;
	private String memberName;
	private MemberRole memberRole; // U | A
	private Gender gender;
	private Date birthday; // 날짜만
	private String email;
	private String phone;
	private String hobby;
	private int point;
	private Timestamp enrollDate; // 날짜/시각정보 
	
	public Member(String memberId, String password, String memberName, MemberRole memberRole, Gender gender,
			Date birthday, String email, String phone, String hobby, int point, Timestamp enrollDate) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.memberName = memberName;
		this.memberRole = memberRole;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.phone = phone;
		this.hobby = hobby;
		this.point = point;
		this.enrollDate = enrollDate;
	}
	
	public Member() {
		super();
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public MemberRole getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(MemberRole memberRole) {
		this.memberRole = memberRole;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Timestamp getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Timestamp enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", password=" + password + ", memberName=" + memberName
				+ ", memberRole=" + memberRole + ", gender=" + gender + ", birthday=" + birthday + ", email=" + email
				+ ", phone=" + phone + ", hobby=" + hobby + ", point=" + point + ", enrollDate=" + enrollDate + "]";
	}
	
	
}
