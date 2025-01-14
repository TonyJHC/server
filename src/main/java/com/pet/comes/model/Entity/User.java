package com.pet.comes.model.Entity;

import com.pet.comes.dto.Join.UserJoinDto;
import com.pet.comes.model.EnumType.SocialType;
import com.pet.comes.model.EnumType.UserStatus;
import com.pet.comes.model.Timestamped;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class User extends Timestamped { //extends Timestamped

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private UserStatus status = UserStatus.NORMAL;

    @Enumerated(value = EnumType.STRING)
    private SocialType socialType = SocialType.NOT;

    private String name;
    private String email;
    private String password;
    private String nickname;
    private String introduction;
    private String imageUrl;

    public User(UserJoinDto userJoinDto) {
        this.name = userJoinDto.getName();
        this.email = userJoinDto.getEmail();
        this.password = userJoinDto.getPassword();
        this.nickname = userJoinDto.getNickname();
        this.introduction = userJoinDto.getIntroduction();
        this.imageUrl = userJoinDto.getImageUrl();
    }
}
