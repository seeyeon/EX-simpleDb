package com.ll.SimpleDb;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor  //final 키워드가 붙어있는 필드의 생성자 생성
public class SimpleDb {

    private final String host;
    private final String username;
    private final String pwd;
    private final String dbName;

}
