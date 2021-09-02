package com.ysj.yiSheng.constant;

/**
 * 存放weLink 所有的URL或者一些常量数据
 */
@SuppressWarnings("all")
public class WeLinkConstant {

    // 获取的access_token
    public static String access_token = "";

    // 用户的suerId
    public static String userId = "";

    // we码提供的client_id
    public static final String clientId = "20210831172015920701139";

    // we码提供的client_secret
    public static final String clientSecret = "7f039301-971d-4289-861e-0fb97ac32ba5";

    // 该URL用于获取we码小程序授权的access_token
    public static final String userAuthUrl = "https://open.welink.huaweicloud.com/api/auth/v2/tickets";

    // 该URL用于获取we码小程序的userId与corpUserId
    public static final String userIdUrl = "https://open.welink.huaweicloud.com/api/auth/v2/userid";

    //该URL用于判断用户是否为应用管理员
    public static final String isAdmin = "https://open.welink.huaweicloud.com/api/weopen/v1/isadmin";

    // 该URL用于获取we码小程序中某个用户的具体信息
    public static final String userDetailUrl = "https://open.welink.huaweicloud.com/api/contact/v3/users";

    //该URL用于查询部门的人员信息列表（详细信息）
    public static final String usersDpartmentDetailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/users";

    //该URL用于查询部门用户（简单）
    public static final String userSimpleDpartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/simplelist";

    //该URL用于查询部门用户（详细）
    public static final String userDetailDpartmentDetailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/list";

    //该URL用于获取用户信息，包括邮箱等敏感信息
    public static final String userEmailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/users/email";

    //该URL用于查询部门的人员信息列表(简单信息)
    public static final String userUserSimpleUrl = "https://open.welink.huaweicloud.com/api/contact/v2/user/userid";

    //该URL用于修改用户手机号
    public static final String modifyUserEmailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/mobilenumber";

    //该URL用于异步批量同步用户（新）
    public static final String SynchronizationBulkUrl = "https://open.welink.huaweicloud.com/api/contact/v2/users/bulk";

    //该URL用于异步批量更新用户
    public static final String SynchronizationUpdateUrl = "https://open.welink.huaweicloud.com/api/contact/v1/users/update";

    //该URL用于异步批量同步部门
    public static final String AsynchronouslySynchronizeDepartmentsBatchesUrl = "https://open.welink.huaweicloud.com/api/contact/v2/departments/bulk";

    //该URL用于查询部门异步同步结果
    public static final String SearchDepartmentStausUrl = "https://open.welink.huaweicloud.com/api/contact/v2/departments/status";

    //该URL用于创建角色组
    public static final String CreateRoleGroupUrl = "https://open.welink.huaweicloud.com/api/contact/v1/rolegroup/create";

    //该URL用于更新角色组
    public static final String updateRoleGroupUrl = "https://open.welink.huaweicloud.com/api/contact/v1/rolegroup/update";

    //该URL用于删除角色组
    public static final String deleteRoleGroupUrl = "https://open.welink.huaweicloud.com/api/contact/v1/rolegroup/delete";

    //该URL用于创建角色
    public static final String createRoleUrl = "https://open.welink.huaweicloud.com/api/contact/v1/role/create";

    //该URL用于更新角色
    public static final String updateRoleUrl = "https://open.welink.huaweicloud.com/api/contact/v1/role/update";

    //该URL用于删除角色
    public static final String deleteRoleUrl = "https://open.welink.huaweicloud.com/api/contact/v1/role/delete";

    //该URL用于创建用户
    public static final String createUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/create";

    //该URL用于更新用户
    public static final String updateUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/update";

    //该URL用于删除用户
    public static final String deleteUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/delete";

    //该URL用于创建部门
    public static final String createDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/create";

    //该URL用于更新部门
    public static final String updateDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/update";

    //该URL用于删除部门
    public static final String deleteDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/delete";

    //该URL用于批量创建用户
    public static final String batchCreateUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/batch/create";

    //该URL用于批量更新用户
    public static final String batchUpdateUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/batch/update";

    //该URL用于批量更新绑定手机号码
    public static final String batchUpdateMobileUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/batch/updatemobile";

    //该URL用于批量更新客户侧用户corpUserId
    public static final String batchUpdateCorpuidUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/batch/updatecorpuid";

    //该URL用于批量删除用户
    public static final String batchDeleteUserUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/batch/delete";

    //该URL用于批量创建部门
    public static final String batchCreateDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/batch/create";

    //该URL用于批量更新部门
    public static final String batchUpdateDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/batch/update";

    //该URL用于批量更新客户侧部门corpDeptCode
    public static final String batchUpdateCorpdeptUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/batch/updatecorpdept";

    //该URL用于批量删除部门
    public static final String batchDeleteDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/batch/delete";

    //该URL用于获取异步任务结果
    public static final String batchTashResultUrl = "https://open.welink.huaweicloud.com/api/contact/v1/batch/result";

    //该URL用于查询部门详情
    public static final String searchDepartmentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/departments/{deptcode}";

    //该URL用于查询子部门信息
    public static final String searchDepartmentsListUrl = "https://open.welink.huaweicloud.com/api/contact/v3/departments/list";

    //该URL用于查询父部门信息
    public static final String searchDepartmentParentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/parent";

    //该URL用于查询用户父级部门
    public static final String searchUserParentUrl = "https://open.welink.huaweicloud.com/api/contact/v1/user/parent";

    //该URL用于获取角色组详情
    public static final String getRoleGroupDetailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/rolegroup/detail";

    //该URL用于获取角色组列表
    public static final String getRoleGroupListUrl = "https://open.welink.huaweicloud.com/api/contact/v1/rolegroup/list";

    //该URL用于获取角色详情
    public static final String getRoleDetailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/role/detail";

    //该URL用于查询指定角色用户列表
    public static final String searchRoleSimpleListUrl = "https://open.welink.huaweicloud.com/api/contact/v1/role/simplelist";

    //该URL用于查询部门详情
    public static final String searchDepartmentDetailUrl = "https://open.welink.huaweicloud.com/api/contact/v1/department/detail";

    //该URL用于查询父部门列表
    public static final String searchDepartmentParentsUrl = "https://open.welink.huaweicloud.com/api/contact/v2/department/parent";

    //该URL用于获取分域管理员管理的部门范围
    public static final String getUserDomainScopeUrl = "https://open.welink.huaweicloud.com/api/admincenter/v1/user/domain/scope";

    //该URL用于发消息到群组
    public static final String chatGroupChatUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/im-service/chat/group-chat";

    //该URL用于创建群组
    public static final String createGroupCreateUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group/create-group";

    //该URL用于解散群组
    public static final String disbandGrouplUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group/disband-group";

    //该URL用于转让群组身份
    public static final String transferGroupOwnerUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group/transfer-group-owner";

    //该URL用于加用户到群组
    public static final String addGroupMemberUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group-member/add-group-member";

    //该URL用于将用户移出群组
    public static final String removeGroupMemberUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group-member/remove-group-member";

    //该URL用于修改群组名称
    public static final String modifyGroupNameUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group/modify-group-name";

    //该URL用于修改群组容量
    public static final String modifyGroupCapacityUrl = "https://open.welink.huaweicloud.com/api/welinkim/v1/group-service/group/modify-group-capacity";

    //该URL用于公众号消息接口
    public static final String sedmessagesUrl = "https://open.welink.huaweicloud.com/api/messages/v3/send";

    //该URL用于普通卡片消息
    public static final String messageCardCommonUrl = "https://open.welink.huaweicloud.com/api/messages/v1/card/common";

    //该URL用于应用卡片消息
    public static final String wecodeCardUrl = "https://open.welink.huaweicloud.com/api/messages/v1/card/wecode";

    //该URL用于图片消息
    public static final String imageMessageUrl = "https://open.welink.huaweicloud.com/api/messages/v1/image";

    //该URL用于图文消息
    public static final String newsImageUrl = "https://open.welink.huaweicloud.com/api/messages/v1/news";

    //该URL用于小微推送
    public static final String pushContextAwareUrl = "https://open.welink.huaweicloud.com/api/athenaservice/v1/contextaware/push";

    //该URL用于考勤打卡
    public static final String attendanceRecordsUrl = "https://open.welink.huaweicloud.com/api/attendance/v2/records";

    //该URL用于获取打开数据
    public static final String openAttendanceRecordsUrl = "https://open.welink.huaweicloud.com/api/attendance/v3/records";

    //该URL用于查询考勤组
    public static final String searchAttendanceGroupListUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/group/list";

    //该URL用于同步人员考勤组
    public static final String groupSettingsUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/group/settings";

    //该URL用于创建班次
    public static final String createSettiingScheduleUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/schedule/setting/create";

    //该URL用于更新班次
    public static final String updateSettiingScheduleUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/schedule/setting/update";

    //该URL用于删除班次
    public static final String deleteSettiingScheduleUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/schedule/setting/delete";

    //该URL用于查询班次
    public static final String searchListScheduleUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/schedule/list";

    //该URL用于同步人员排班
    public static final String rulesSettingsUrl = "https://open.welink.huaweicloud.com/api/attendance/v1/group/settings/rules";

    //该URL用于新增待办任务(新)
    public static final String addTaskTodoUrl = "https://open.welink.huaweicloud.com/api/todo/v3/addtask";

    //该URL用于更新待办事项(新)
    public static final String updaTaskUrl = "https://open.welink.huaweicloud.com/api/todo/v2/updatetask";

    //该URL用于删除待办任务（撤销（或完成）指定电子流）
    public static final String delTaskUrl = "https://open.welink.huaweicloud.com/api/todo/v1/deltask";

    //该URL用于新增文章(新）
    public static final String addArticlesUrl = "https://open.welink.huaweicloud.com/api/knowledge/v2/articles/add";

    //该URL用于更新文章（新）
    public static final String updateArticlesUrl = "https://open.welink.huaweicloud.com/api/knowledge/v2/articles/update";

    //该URL用于删除文章
    public static final String deleteArticlesUrl = "https://open.welink.huaweicloud.com/api/knowledge/v1/articles/delete";

    //该URL用于附件上传
    public static final String fileUploadUrl = "https://open.welink.huaweicloud.com/api/knowledge/v1/file/upload";

    //该URL用于修改附件
    public static final String updateFileUrl = "https://open.welink.huaweicloud.com/api/knowledge/v1/file/update";

    //该URL用于删除附件
    public static final String deleteFileUrl = "https://open.welink.huaweicloud.com/api/knowledge/v1/file/delete?fileId={fileId}";

    //该URL用于图片上传
    public static final String uploadImagesUrl = "https://open.welink.huaweicloud.com/api/tinyimage/v2/images";

    //该URL用于新增会议日历
    public static final String addMeetingsUrl = "https://open.welink.huaweicloud.com/api/calendar/v1/meetings/add";

    //该URL用于更新会议日历
    public static final String updateMeetingsUrl = "https://open.welink.huaweicloud.com/api/calendar/v1/meetings/update";

    //该URL用于删除会议日历
    public static final String deleteMeetingsUrl = "https://open.welink.huaweicloud.com/api/calendar/v1/meetings/delete";

    //该URL用于新增事件日历
    public static final String addEventsUrl = "https://open.welink.huaweicloud.com/api/calendar/v1/events/add";

    //该URL用于事件日历更新
    public static final String updateEventsUrl = "https://open.welink.huaweicloud.com/api/calendar/v1/events/update";

    //该URL用于删除事件日历
    public static final String deleteEventsUrl = "https://open.welink.huaweicloud.com/api/calendar/v1/events/delete";

    //该URL用于预约会议
    public static final String createConferencrUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/createconference?userId={userId}";

    //该URL用于取消预定会议
    public static final String deleteconferenceUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/deleteconference";

    //该URL用于修改预定会议
    public static final String updateConferenceUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/updateconference";

    //该URL用于查询会议列表
    public static final String queryconferenceUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/queryconferences";

    //该URL用于查询会议信息
    public static final String queryConferenceDetailUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/queryconferencedetail";

    //该URL用于查询历史会议列表
    public static final String queryHistoryConferencesUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/queryhistoryconferences";

    //该URL用于查询历史会议信息
    public static final String queryHistoryConferenceDetailUrl = "https://open.welink.huaweicloud.com/api/meeting/v1/queryhistoryconferencedetail";

    //该URL用于名片识别
    public static final String ocrBussinessCard = "https://open.welink.huaweicloud.com/api/aiservice/v1/ocr/business-card";

    //该URL用于文档识字
    public static final String ocrGeneralTableUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/ocr/general-table";

    //该URL用于拍图识字
    public static final String ocrWebImageUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/ocr/web-image";

    //该URL用于身份证识别
    public static final String ocrIdCardUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/ocr/id-card";

    //该URL用于票证识别
    public static final String ocrAutoClassificationUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/ocr/auto-classification";

    //该URL用于人脸检测
    public static final String frcFaceDetectUrl = "https://open.welink.huaweicloud.com/api/aiservice/v2/frs/face-detect";

    //该URL用于人脸比对
    public static final String frcFaceCompareUrl = "https://open.welink.huaweicloud.com/api/aiservice/v2/frs/face-compare";

    //该URL用于语音识别
    public static final String sisShortAudioUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/sis/short-audio";

    //该URL用于语音评测
    public static final String sisAudioAssessmentUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/sis/audio-assessment";

    //该URL用于语音合成
    public static final String sisttsUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/sis/tts";

    //该URL用于文本分词
    public static final String nlpSegmentUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/segment";

    //该URL用于句向量
    public static final String nlpSentenceEmbeddingUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/sentence-embedding";

    //该URL用于命名实体识别
    public static final String nlpNerUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/ner";

    //该URL用于文本摘要生成
    public static final String nlpSummarizationUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/summarization";

    //该URL用于文本相似度
    public static final String textSimilarityUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/text-similarity";

    //该URL用于意图理解
    public static final String semanticParserUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/semantic-parser";

    //该URL用于情感分析
    public static final String nlpSentimentUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/nlp/sentiment";

    //该URL用于图片审核
    public static final String moderaitionImageUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/moderation/image";

    //该URL用于文本内容审核
    public static final String moderationTextUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/moderation/text";

    //该URL用于文本翻译
    public static final String translateTextUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/translate/translate";

    //该URL用于获取已支持的翻译语种
    public static final String getTranSlateUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/translate/supported";

    //该URL用于语种检测
    public static final String translateDetectUrl = "https://open.welink.huaweicloud.com/api/aiservice/v1/translate/detect";

    //该URL用于直播列表
    public static final String roomsListUrl = "https://open.welink.huaweicloud.com/api/livecast/v1/rooms/list";

    //该URL用于获取直播间详情
    public static final String roomsDetailUrl = "https://open.welink.huaweicloud.com/api/livecast/v1/rooms/detail";

    //该URL用于获取直播间用户
    public static final String roomsAudienceUrl = "https://open.welink.huaweicloud.com/api/livecast/v1/rooms/audience";

    //该URL用于获取直播间回看信息
    public static final String getvideosUrl = "https://open.welink.huaweicloud.com/api/livecast/v1/videos";

    //该URL用于获取回看视频的观众
    public static final String audienceVediosUrl = "https://open.welink.huaweicloud.com/api/livecast/v1/videos/audience";

    //该URL用于查询健康打卡数据
    public static final String userHealthUrl = "https://open.welink.huaweicloud.com/api/approve/v1/user/health";

    //该URL用于批量新增数据
    public static final String addBulkIndexsUrl = "https://open.welink.huaweicloud.com/api/search/v1/indexes/bulk/add";

    //该URL用于批量删除数据
    public static final String delBulkIndexsUrl = "https://open.welink.huaweicloud.com/api/search/v1/indexes/bulk/del";

    //该URL用于批量更新数据
    public static final String editBulkIndexsUrl = "https://open.welink.huaweicloud.com/api/search/v1/indexes/bulk/edit";

    //该URL用于搜索企业数据
    public static final String serachIndexsUrl = "https://open.welink.huaweicloud.com/api/search/v1/indexes/search";

    //该URL用于更新应用
    public static final String updateWecodeUrl = "https://open.welink.huaweicloud.com/api/weopen/wecode/update";

    //该URL用于查询应用详情
    public static final String searchWecodeDetailUrl = "https://open.welink.huaweicloud.com/api/weopen/wecode/detail";

    //该URL用于查询应用列表
    public static final String SearchWecodeListUrl = "https://open.welink.huaweicloud.com/api/weopen/wecode/list";

}
