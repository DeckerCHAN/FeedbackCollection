# Feedback Collection


## JSON

### Questions
```json
{
	"surveyCode": "ServiceFeedBack-CHN",
	"questions": {
		"singleSelectionQuestion": [
			{
				"sequence": 0,
				"title": "sample single select question 1!",
				"options": [
					"answer1",
					"answer2",
					"answer3"
				]
			},
			{
				"sequence": 3,
				"title": "sample single select question 2!",
				"options": [
					"answer1",
					"answer2",
					"answer3"
				]
			}
		],
		"multiSelectionQuestion": [
			{
				"sequence": 1,
				"title": "sample multi selection question 1!",
				"options": [
					"answer1",
					"answer2",
					"answer3"
				]
			}
		],
		"pureTextQuestion": [
			{
				"sequence": 4,
				"title": "sample pure text question 1!"
			}
		],
		"selectionExtraTextQuestion": [
			{
				"sequence": 5,
				"title": "Selection question may have extra text answer.",
                "options": [
					"answer1",
					"answer2",
					"answer3"
				],
				"textOption": "select this as input text"
			}
		]
	}
}

```

## Answer

```json
{
	"surveyCode": "ServiceFeedBack-CHN",
	"answers": {
		"singleSelectAnswer": [
			{
				"sequence": 0,
				"selected": 2,
				"secondUsed": 24
			}
		],
		"multiSelectAnswer": [
			{
				"sequence": 1,
				"selected": [
					1,
					3
				],
				"secondUsed": 31
			},
			{
				"sequence": 2,
				"selected": [
					1,
					2
				],
				"secondUsed": 45
			}
		],
		"pureTextAnswer": [
			{
				"sequence": 3,
				"answer": "What a good service!",
				"secondUsed": 47
			}
		],
		"selectionExtraTextAnswer": [
			{
				"sequence": 4,
				"selected": -1,
                    "answer": "What a good service!"
			}
		]
	}
}


```