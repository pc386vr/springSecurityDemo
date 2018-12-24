package com.akion.demo.service.dto;

import org.springframework.security.core.authority.AuthorityUtils;

import com.akion.demo.persistence.Entity.MLoginUser;

public class LoginUserDto
	extends org.springframework.security.core.userdetails.User {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1871965425305368644L;
		/**
	     * ログインユーザー
	     */
	    private final MLoginUser mLoginUser;
	    /**
	     * その他、ログイン後に利用したい情報があればここで宣言する
	     */

	    /**
	     * コンストラクタ
	     * @param user
	     */
	    public LoginUserDto(MLoginUser user) {
	        // スーパークラスのユーザーID、パスワードに値をセットする
	        // 実際の認証はスーパークラスのユーザーID、パスワードで行われる
	        super(user.getLoginUserId(), user.getPassword(),
	                AuthorityUtils.createAuthorityList("ROLE_USER"));
	        this.mLoginUser = user;
	    }

	    /**
	     *
	     * @return
	     */
	    public MLoginUser getUser() {
	        return mLoginUser;
	    }
	}
