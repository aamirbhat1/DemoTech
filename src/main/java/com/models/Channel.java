package com.models;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="channel")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Channel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="channel_id")
	private int channelId;
	
	@Column(name="channel_name")
	private String channelName;
	
	@Column(name="channel_phone")
	private String channelPhone;
	
	@Column(name="channel_mail")
	private String channelmail;
	
	@Column(name="channel_entry_date")
	private LocalDateTime channelEntryDate;
	
	@Column(name="channel_modified_date")
	private LocalDateTime channelModifiedDate;
	
	@Column(name="channel_landmark")
	private String channelLandmark;
	
	@Column(name="channel_modified_id")
	private int channelModifiedId;
	
	@Column(name="channel_active")
	private char channelActive;
	
	@Column(name="channel_photo")
	private Blob channelPhoto;
	
}
