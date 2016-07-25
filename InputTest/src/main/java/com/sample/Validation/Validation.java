package com.sample.Validation;

import com.sample.InputTest.common.User;

/**
 * 入力値チェック.
 * 
 * @author akane.kaku
 *
 */
public class Validation {
	/**
	 * 名前の入力値チェック
	 * 
	 * @param user
	 * @return
	 */
	public static String nameCheck(User user) {
		if (user.getName() == null || user.getName().length() == 0) {
			return "名前を入力してください";
		} else if (!(user.getName().equals("賀来"))) {
			return "入力された名前が不正です";
		}
		return null;
	}

	/**
	 * メールアドレスのチェック
	 * 
	 * @param user
	 * @return
	 */
	public static String emailCheck(User user) {
		if (user.getEmail() == null || user.getEmail().length() == 0) {
			return "メールアドレスを入力してください";
		} else if (!(user.getEmail().equals("kaku@rakus.co.jp"))) {
			return "メールアドレスが違います";
		} else if (user.getEmail().indexOf("@") == -1 && user.getEmail().indexOf(".") == -1) {
			return "メールアドレスの形式が不正です";
		} else if (user.getEmail().length() <= 2) {
			return "メールアドレスの値が不正です";
		}
		return null;
	}

	/**
	 * パスワードのチェック
	 * 
	 * @param user
	 * @return
	 */
	public static String passCheck(User user) {

		if (user.getPassword() == null || user.getPassword().length() == 0) {
			return "パスワードを入力してください";
		} else if (user.getPassword().length() < 8 && user.getPassword().length() > 16) {
			return "パスワードは8文字以上16文字以内で入力してください";
		} else if (!(user.getPassword().equals("kakuakane"))) {
			return "パスワードが違います";
		}
		//TODO:パスワードのセキュリティ強化.半角英数字記号を含める
		
		// for (char temp : user.getPassword().toCharArray()) {
		// if (!(temp >= '!' && temp <= '~')) {
		// if (temp >= 'A' && temp <= 'Z') {
		// check = false;
		// } else if (!(temp >= 'a' && temp <= 'z')) {
		// check = true;
		// } else if (!(temp >= '0' && temp <= '9')) {
		// check = false;
		// }

		return null;
	}
}

