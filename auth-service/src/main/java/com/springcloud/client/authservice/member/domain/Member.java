package com.springcloud.client.authservice.member.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;



@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)

@Table(name = "memebers")
public class Member {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kakao_id")
    private String kakaoId;

    @Column(name = "profile_url")
    private String profileUrl;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Builder
    public Member(String kakaoId) {
        this.kakaoId = kakaoId;
        this.status = MemberStatus.ACTIVE_FIRST_LOGIN;
    }

    public Member(Long id, String kakaoId, String profileUrl, MemberStatus status) {
        this.id = id;
        this.kakaoId = kakaoId;
        this.profileUrl = profileUrl;
        this.status = status;
    }

}
