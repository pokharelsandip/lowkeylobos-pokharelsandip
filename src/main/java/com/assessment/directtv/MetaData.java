package com.assessment.directtv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaData {

        public String resourceType;
        public String itemType;
        public String title;
        public String description;
        public String contentType;
        public String displayTitle;
        public String marketId;
        public String ccId;
        public Long majorChannelNumber;
        public String name;
        public String metadataLanguage;
        public ArrayList<String> genres;
        public ArrayList<Season> seasons;
        public String parentalRating;
        public String originalAirDate;
        public String releaseYear;
        public Augmentation augmentation;
        public ArrayList<String> categories;
        public String programAttribution;
        public String resourceId;

        public String getResourceType() {
                return resourceType;
        }

        public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
        }

        public String getItemType() {
                return itemType;
        }

        public void setItemType(String itemType) {
                this.itemType = itemType;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getContentType() {
                return contentType;
        }

        public void setContentType(String contentType) {
                this.contentType = contentType;
        }

        public String getDisplayTitle() {
                return displayTitle;
        }

        public void setDisplayTitle(String displayTitle) {
                this.displayTitle = displayTitle;
        }

        public String getMarketId() {
                return marketId;
        }

        public void setMarketId(String marketId) {
                this.marketId = marketId;
        }

        public String getCcId() {
                return ccId;
        }

        public void setCcId(String ccId) {
                this.ccId = ccId;
        }

        public Long getMajorChannelNumber() {
                return majorChannelNumber;
        }

        public void setMajorChannelNumber(Long majorChannelNumber) {
                this.majorChannelNumber = majorChannelNumber;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getMetadataLanguage() {
                return metadataLanguage;
        }

        public void setMetadataLanguage(String metadataLanguage) {
                this.metadataLanguage = metadataLanguage;
        }

        public ArrayList<String> getGenres() {
                return genres;
        }

        public void setGenres(ArrayList<String> genres) {
                this.genres = genres;
        }

        public ArrayList<Season> getSeasons() {
                return seasons;
        }

        public void setSeasons(ArrayList<Season> seasons) {
                this.seasons = seasons;
        }

        public String getParentalRating() {
                return parentalRating;
        }

        public void setParentalRating(String parentalRating) {
                this.parentalRating = parentalRating;
        }

        public String getOriginalAirDate() {
                return originalAirDate;
        }

        public void setOriginalAirDate(String originalAirDate) {
                this.originalAirDate = originalAirDate;
        }

        public String getReleaseYear() {
                return releaseYear;
        }

        public void setReleaseYear(String releaseYear) {
                this.releaseYear = releaseYear;
        }

        public Augmentation getAugmentation() {
                return augmentation;
        }

        public void setAugmentation(Augmentation augmentation) {
                this.augmentation = augmentation;
        }

        public ArrayList<String> getCategories() {
                return categories;
        }

        public void setCategories(ArrayList<String> categories) {
                this.categories = categories;
        }

        public String getProgramAttribution() {
                return programAttribution;
        }

        public void setProgramAttribution(String programAttribution) {
                this.programAttribution = programAttribution;
        }

        public String getResourceId() {
                return resourceId;
        }

        public void setResourceId(String resourceId) {
                this.resourceId = resourceId;
        }
}

class Augmentation{
    public Constraints constraints;

        public Constraints getConstraints() {
                return constraints;
        }

        public void setConstraints(Constraints constraints) {
                this.constraints = constraints;
        }
}

class Constraints{
    public boolean isRecordable;

        public boolean isRecordable() {
                return isRecordable;
        }

        public void setRecordable(boolean recordable) {
                isRecordable = recordable;
        }
}

class Season{
    public int seasonNumber;
    public String resourceType;

        public int getSeasonNumber() {
                return seasonNumber;
        }

        public void setSeasonNumber(int seasonNumber) {
                this.seasonNumber = seasonNumber;
        }

        public String getResourceType() {
                return resourceType;
        }

        public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
        }
}