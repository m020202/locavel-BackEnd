package com.example.locavel.web.dto.UserDTO;

import com.example.locavel.domain.enums.Grade;
import com.example.locavel.domain.enums.Role;
import com.example.locavel.domain.enums.SocialType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class UserResponseDto {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateUserProfileResultDTO{
        String profileImage;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class getUserDTO{
        private Long user_id;
        private String username;
        private String nickname;
        private String email;
        private SocialType socialType;
        private String introduce;
        private String phone_num;
        private String profileImage;
        private Grade localGrade;
        private Grade travelerGrade;
        private Role role;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DeleteUserResultDTO{
        private Long user_id;
        private LocalDateTime deleted_at;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateUserDTO{
        private Long user_id;
        private String name;
        private String nickname;
        private String introduce;
        private String phone_num;
        private LocalDateTime updated_at;

    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GradeResponseDto {
        private Long userId;
        private Grade localGrade;
        private Grade travelerGrade;
    }
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserProfileDTO {
        private Long userId;
        private String nickname;
        private Grade localGrade;
        private Grade travelerGrade;
        private String imgUrl;
        private Integer reviewCount;
        private Integer follower;
        private Integer following;
        private String introduce;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MyAreaResponseDto {
        private Long userId;
        private Long regionId;
        private String regionName;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VisitCalendarDTO {
        List<LocalDate> visitDayList;
    }

}
