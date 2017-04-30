package constants;

public class Constants {
	
	public static final String TOTO_URL="http://totogaming.am";
	public static final String SPORT_URL="http://sport.totogaming.am";
	public static final String LOGO_XPATH = "//div[@class=\"logo\"]";

	
	public static final String BALANCE_XPATH = "//*[@id='lblBalance']";
	public static final String TRANSFER_XPATH = "//a[contains(attribute::class, 'transfer')]";
	public static final String AMOUNT_XPATH = "//label[text() = 'Сумма']/../div/input";
	public static final String CONFIRM_XPATH = "//input[@value='Подтвердить']";
	public static final String USERICON_XPATH = "//a[@class='usericon']";
	public static final String LOGOUT_XPATH = "//div[@class='valueList ']/div[8]";
	public static final String CALENDAR_XPATH = "//a[text() = \"Календарь\"]";
	public static final String SPORTFILTER_XPATH = "//div[@id=\"sport_filter\"]";
	public static final String FOOTBALL_XPATH = "//div[@title = \"Футбол\"]";
	public static final String FIRSTMATCH_XPATH = "//div[@class='calBody']/div[1]/div[3]/a[1]";
	public static final String CONTENT_XPATH = "//div[@id=\"reOrder\"]/div[2]";
	public static final String MENU_XPATH = "//div[@id=\"reOrder\"]/div[1]";
	public static final String LIVETV_XPATH = "//span[text() = \"Live TV\"]";
	public static final String PANEL_XPATH = "//div[@class=\"player_panel\"]/div[1]";
	public static final String MATCH_XPATH = "//div[@class=\"player_panel\"]/div[1]/div[1]/div[5]";
	public static final String MOVETV_XPATH = "//div[@class='info_panel shadow']/div[1]/div[2]/div[2]";
	public static final String STATISTICS_XPATH = "//a[@title = \"Статистика\" and @class = \"sm ic\"]";
	public static final String STATMENU_XPATH = "//div[@class = \"menu\"]/div[1]";
	public static final String CONTINENT_XPATH = "//div[@id=\"sp_1\"]/div[3]";
	public static final String A_COUNTRY_XPATH = "//div[@id=\"cont_1_1\"]/div[21]";
	public static final String A_TOURNAMENT_XPATH = "//div[@id=\"cnt_1_74\"]/div[1]";
	public static final String A_MATCH_XPATH = "//div[text() = 'Предстоящие матчи']/../div[2]/div[1]";
	public static final String LANGUAGE_XPATH = "//div[@class='selected displayFlex']";
	public static final String ENGLISH_XPATH = "//div[text() = 'English']";
	public static final String RESULTS_XPATH = "//a[text() = \"Results\"]";
	public static final String COUNTRY_MENU_XPATH = "//div[@id=\"res_cmb_ev\"]";
	public static final String COUNTRY_XPATH = "//div[@id = 'res_cmb_ev']/div[1]/div[6]";
	public static final String TOURNAMENT_MENU_XPATH = "//div[@id = 'res_cmb_evChamp']";
	public static final String TOURNAMENT_XPATH = "//div[@id = 'res_cmb_evChamp']/div[1]/div[11]";
	public static final String SHOW_XPATH = "//input[@value=\"Show\"]";
	public static final String DETAILS_XPATH = "//div[@class='valueList ']/div[1]";
	public static final String OLD_PASSWORD_XPATH = "//input[@id = 'ma_mp_old_pass']";
	public static final String NEW_PASSWORD_XPATH = "//input[@id = 'ma_mp_new_pass']";
	public static final String CONFIRM_PASSWORD_XPATH = "//input[@id = 'ma_mp_new_pass2']";
	public static final String UPDATE_XPATH = "//input[@id = 'ma_md_btnupdate']";
	public static final String CLOSE_BUTTON_XPATH = "//div[@id = 'maPageCloseButton']";
	public static final String REGISTRATION_XPATH = "//*[@id='login_panel']/a[1]";
	public static final String REGISTRATION_EMAIL_XPATH = "//input[@id='reg_email']";
	public static final String REGISTRATION_MOBILE_XPATH = "//input[@id='reg_mobile']";
	public static final String REGISTRATION_USERNAME_XPATH = "//input[@id='reg_username']";
	public static final String REGISTRATION_PASSWORD_XPATH = "//input[@id='reg_pass']";
	public static final String REGISTRATION_PASSWORD1_XPATH = "//input[@id='reg_pass1']";
	public static final String FIRST_NAME_XPATH = "//input[@id='reg_fname']";
	public static final String LAST_NAME_XPATH = "//input[@id='reg_lname']";
	public static final String GENDER_XPATH = "//div[@id='reg_gender']";
	public static final String MALE_XPATH = "//div[@id='reg_gender']/div[1]/div[2]";
	public static final String BIRTHDAY_XPATH = "//div[@id = 'reg_bdate']/div[1]";
	public static final String DAY_XPATH = "//div[@id = 'reg_bdate']/div[1]/div[1]/div[3]";
	public static final String BIRTH_MONTH_XPATH = "//div[@id = 'reg_bdate']/div[2]";
	public static final String MONTH_XPATH = "//div[@id = 'reg_bdate']/div[2]/div[1]/div[4]";
	public static final String BIRTH_YEAR_XPATH = "//div[@id = 'reg_bdate']/div[3]";
	public static final String YEAR_XPATH = "//div[@id = 'reg_bdate']/div[3]/div[1]/div[2]";
	public static final String REGISTRATION_COUNTRY_XPATH = "//div[@id = 'reg_country']";
	public static final String REGISTRATION_COUNTRY1_XPATH = "//div[@id = 'reg_country']/div[1]/div[2]";
	public static final String CITY_XPATH = "//div[@id = 'reg_city']";
	public static final String CITY1_XPATH = "//div[@id = 'reg_city']/div[1]/div[49]";
	public static final String ADDRESS_XPATH = "//input[@id = 'reg_address']";
	public static final String PASSPORT_XPATH = "//input[@id = 'reg_passport']";
	public static final String CONFIRMATION_XPATH = "//span[@class='regChkB']";
	public static final String REGISTRATION_SUBMIT_XPATH = "//input[@id='reg_submit']";
	public static final String LOGO_2_XPATH = "//div[@class = 'tl_logo']";
	public static final String BELOTE_XPATH = "//div[@class='sportHeaderPaneNavigation displayFlex']/a[9]";
	public static final String BELOTE_LOGIN_PANEL_XPATH = "//a[@data-dialog-title='Login']";
	public static final String BELOTE_EMAIL_XPATH = "//input[@id='email']";
	public static final String BELOTE_PASSWORD_XPATH = "//input[@id='password']";
	public static final String BELOTE_LOGIN_XPATH = "//button[@class = 'tl_btn_popup login_btn btnSec transBg']";
	public static final String BELOTE_LANGUAGE_XPATH = "//div[@class = 'tl_drop_down tl_acc_lang flex ternBtn transBg']";
	public static final String BELOTE_ENGLISH_XPATH = "//a[@href = '/en/belote ']";
	public static final String BET_SUM_XPATH = "//input[@id = 'classic_bet_sum']";
	public static final String GAME_SCORE_XPATH = "//input[@id = 'classic_bet_sum']/../../div[3]/div[1]";
	public static final String GAME_SCORE1_XPATH = "//ul[@style = 'display: block;']/li[2]";
	public static final String STEP_TIME_XPATH = "//input[@id = 'classic_bet_sum']/../../div[4]/div[1]";
	public static final String STEP_TIME1_XPATH = "//ul[@style = 'display: block;']/li[3]";
	public static final String PRIVATE_GAME_XPATH = "//input[@id = 'classic_bet_sum']/../../div[5]/div[1]/label";
	public static final String FOUR_CARDS_XPATH = "//input[@id = 'classic_bet_sum']/../../div[6]/div[1]/label";
	public static final String SUBMIT_BUTTON_XPATH = "//button[@type = 'submit']";
	
	public static void main(String[] args) {
		
	}

}
