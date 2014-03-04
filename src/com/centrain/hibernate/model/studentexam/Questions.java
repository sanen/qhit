package com.centrain.hibernate.model.studentexam;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Questions implements Serializable {

	private int id;//考试试题编号
	private String question;//考试试题内容
	private String answerA;//试题答案A内容
	private String answerB;//试题答案Ｂ内容
	private String answerC;//试题答案Ｃ内容
	private String answerD;//试题答案D内容
	private String rightAnswer;//试题正确答案
	
	private Subject subject;//考试试题科目

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
}
