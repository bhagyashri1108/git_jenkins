node{
	
	stage('SCM'){
		echo 'gathering code form version control.....'
	}
	stage('Build'){
		echo 'Building.....'
	}
	stage('Test'){
		echo 'Testing.....'
	}
	stage('Deploy'){
		echo 'deploying.....'
	}
}