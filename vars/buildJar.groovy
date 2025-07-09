#!/usr/bin/env groovy

def call() {
    echo "building the application..."
    sh 'gradle clean build'
}
