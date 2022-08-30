package redoc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "PASS_WORD")
	private String passWord;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DOB")
	private String DOB;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "CONTACT_NO")
	private Long contactNo;

	@Column(name = "FEED_BACK")
	private String feedBack;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "ADDRESS")
	private String address;

}
